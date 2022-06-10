package yxl.day3.service.Impl;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.day3.dto.RegisterProto;
import yxl.day3.entity.*;
import yxl.day3.mapper.PlayerMapper;
import yxl.day3.mapper.RankingMapper;
import yxl.day3.mapper.RegisterMapper;
import yxl.day3.mapper.ServersMapper;
import yxl.day3.service.RankService;

import java.util.*;

@Service
public class RankServiceImpl implements RankService {


    @Autowired
    private RankingMapper rankingMapper;


    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private ServersMapper serversMapper;

    private final List<RankingCard> ranks = new ArrayList<>();

    @Override
    public List<RankingCard> findAll() {
        ranks.addAll(rankingMapper.findAll());
        return rankingMapper.findAll();
    }

    @Override
    public List<RankingCard> findAllByServerId(int serverId) {
        ServerCard serverCard = serversMapper.findServerCardById(serverId);
        if (serverCard == null) {
            //log.error
            return null;
        }
        return rankingMapper.findAllByServerId(serverId);
    }

    @Override
    public boolean changeRank(int uid1, int uid2) {

        PlayerCard p1 = playerMapper.findIdById(uid1);
        PlayerCard p2 = playerMapper.findIdById(uid1);
        if (uid1 <= 0 || uid2 <= 0) {
            //log.error;
            return false;
        }

        //判断用户是否存在
        RankingCard rr1 = rankingMapper.findRankCardByUidAndServerId(p1.getId(), p1.getServerId());
        RankingCard rr2 = rankingMapper.findRankCardByUidAndServerId(p1.getId(), p1.getServerId());
        if (rr1 == null || rr2 == null) {
            //Log.error user is not exists;
            return false;
        }

        //获取排名
        int r1 = rr1.getRank();
        int r2 = rr2.getRank();
        //修改排名
        int ok = rankingMapper.updateRankByUidAndServerId(r1, uid2, p2.getServerId()) + rankingMapper.updateRankByUidAndServerId(r2, uid1, p1.getServerId());
        this.ranks.clear();
        this.ranks.addAll(rankingMapper.findAll());
        return ok == 2;
    }

    @Override
    public boolean insertRank(int uid, int serverId) {
        ServerCard serverCard = serversMapper.findServerCardById(serverId);
        PlayerCard player = playerMapper.findIdById(uid);
        if (serverCard == null || player == null) {
            //log.error
            return false;
        }

        //获取当前服务器用户数量并+1
        int rank = rankingMapper.findRanks(serverId) + 1;


        //插入用户
        int ok = rankingMapper.insertRank(uid, serverId, rank);
        this.ranks.clear();
        this.ranks.addAll(rankingMapper.findAll());
        return ok == 1;
    }

    @Override
    public boolean deleteRankByUidAndServerId(int uid) {
        PlayerCard player = playerMapper.findIdById(uid);
        if (player == null) {
            //log.error;
            return false;
        }

        //判断用户是否存在
        RankingCard p1 = rankingMapper.findRankCardByUidAndServerId(uid, player.getServerId());
        if (p1 == null) {
            //Log.error user is not exists;
            return false;
        }

        int ok = rankingMapper.deleteRankByUidAndServerId(uid, player.getServerId());

        if (ok != 1)
            return false;

        List<RankingCard> players = rankingMapper.findAllByServerId(p1.getServerId());

        Collections.sort(players);

        for (RankingCard p : players) {
            if (p.getRank() > p1.getRank()) {
                int o = rankingMapper.updateRankByUidAndServerId(p.getRank() - 1, p.getUid(), p.getServerId());
                //if (o==0) log.error
            }
        }
        this.ranks.clear();
        this.ranks.addAll(rankingMapper.findAll());
        return true;
    }

    @Override
    public boolean deleteRankByRankAndServerId(int rank, int serverId) {
        ServerCard serverCard = serversMapper.findServerCardById(serverId);
        if (rank <= 0 || serverCard == null) {
            //log.error;
            return false;
        }

        //判断用户是否存在
        RankingCard p1 = rankingMapper.findRankCardByRankAndServerId(rank, serverId);
        if (p1 == null) {
            //Log.error user is not exists;
            return false;
        }
        int ok = rankingMapper.deleteRankByRankAndServerId(rank, serverId);
        if (ok != 1)
            return false;

        List<RankingCard> players = rankingMapper.findAllByServerId(p1.getServerId());

        Collections.sort(players);

        for (RankingCard p : players) {
            if (p.getRank() > p1.getRank()) {
                int o = rankingMapper.updateRankByUidAndServerId(p.getRank() - 1, p.getId(), p.getServerId());
                //if (o==0) log.error
            }
        }
        this.ranks.clear();
        this.ranks.addAll(rankingMapper.findAll());
        return true;
    }

    @Override
    public Ranks findRanksByUidAndServerId(int uid, int serverId) {
        ServerCard serverCard = serversMapper.findServerCardById(serverId);
        PlayerCard player = playerMapper.findIdById(uid);
        if (serverCard == null || player == null) {
            //log.error
            return null;
        }

        Ranks ranks = new Ranks();

        RankingCard p = rankingMapper.findRankCardByUidAndServerId(uid, serverId);
        if (p == null) {
            //Log.error user is not exists;
            return null;
        }
        ranks.setSelf(p);

        int index;
        if (p.getRank() <= 100)
            index = 1;
        else if (p.getRank() > 100 && p.getRank() <= 500)
            index = 3;
        else if (p.getRank() > 500 && p.getRank() <= 2000)
            index = 10;
        else if (p.getRank() > 2000 && p.getRank() <= 5000)
            index = 20;
        else if (p.getRank() > 5000 && p.getRank() <= 10000)
            index = 50;
        else
            index = 100;

        List<RankingCard> serverRank = rankingMapper.findAllByServerId(p.getServerId());

        List<RankingCard> first = new ArrayList<>();
        for (int i = 0; i < 10 && serverRank.size() >= 10; i++) {
            first.add(serverRank.get(i));
        }

        Collections.sort(first);
        ranks.setFirst(first);

        List<RankingCard> pre = new ArrayList<>();
        int j = 1;
        for (int i = p.getRank() - 1; j <= 10 && i - j * index >= 0; j++) {
            pre.add(serverRank.get(i - j * index));
        }
        Collections.sort(pre);
        ranks.setPre(pre);


        List<RankingCard> after = new ArrayList<>();
        j = 0;
        for (int i = p.getRank(); j < 10 && i + j * index < serverRank.size(); j++) {
            after.add(serverRank.get(i + j * index));
        }
        Collections.sort(after);
        ranks.setAfter(after);


        return ranks;
    }

    @Override
    public int findRanks(int serverId) {
        ServerCard serverCard = serversMapper.findServerCardById(serverId);
        if (serverCard == null) {
            //log.error
            return -1;
        }
        return rankingMapper.findRanks(serverId);
    }

    @Override
    public RankingCard findRankCardByUid(int uid) {
        PlayerCard player = playerMapper.findIdById(uid);
        if (player == null) {
            //log.error;
            return null;
        }
        return rankingMapper.findRankCardByUidAndServerId(uid, player.getServerId());
    }



}
