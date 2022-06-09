package yxl.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.demo.entity.Player;
import yxl.demo.entity.Ranks;
import yxl.demo.mapper.PlayerMapper;
import yxl.demo.service.PlayerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {


    @Autowired
    private PlayerMapper playerMapper;

    private final List<Player> ranks = new ArrayList<>();

    @Override
    public List<Player> findAll() {
        ranks.addAll(playerMapper.findAll());
        return playerMapper.findAll();
    }

    @Override
    public List<Player> findAllByServerId(int serverId) {
        if (serverId <= 0) {
            //log.error
            return null;
        }
        return playerMapper.findAllByServerId(serverId);
    }

    @Override
    public boolean changeRank(int id1, int id2) {
        if (id1 <= 0 || id2 <= 0) {
            //log.error;
            return false;
        }

        //判断用户是否存在
        Player p1 = playerMapper.findPlayerById(id1);
        Player p2 = playerMapper.findPlayerById(id2);
        if (p1 == null || p2 == null) {
            //Log.error user is not exists;
            return false;
        }

        //获取排名
        int r1 = p1.getRank();
        int r2 = p2.getRank();
        //修改排名
        int ok = playerMapper.updateRankById(r1, id2) + playerMapper.updateRankById(r2, id1);
        this.ranks.clear();
        this.ranks.addAll(playerMapper.findAll());
        return ok == 2;
    }

    @Override
    public boolean insertPlayer(int serverId) {
        if (serverId <= 0)
            //log.error
            return false;

        //获取当前服务器用户数量并+1
        int rank = playerMapper.findPlayers(serverId) + 1;


        //插入用户
        int ok = playerMapper.insertPlayer(serverId, rank);
        this.ranks.clear();
        this.ranks.addAll(playerMapper.findAll());
        return ok == 1;
    }

    @Override
    public boolean deletePlayerById(int id) {
        if (id <= 0) {
            //log.error;
            return false;
        }

        //判断用户是否存在
        Player p1 = playerMapper.findPlayerById(id);
        if (p1 == null) {
            //Log.error user is not exists;
            return false;
        }
        int ok = playerMapper.deletePlayerById(id);
        if (ok != 1)
            return false;

        List<Player> players = playerMapper.findAllByServerId(p1.getServerId());

        Collections.sort(players);

        for (Player p : players) {
            if (p.getRank() > p1.getRank()) {
                int o = playerMapper.updateRankById(p.getRank() - 1, p.getId());
                //if (o==0) log.error
            }
        }
        this.ranks.clear();
        this.ranks.addAll(playerMapper.findAll());
        return true;
    }

    @Override
    public boolean deletePlayerByRank(int rank, int serverId) {
        if (rank <= 0 || serverId <= 0) {
            //log.error;
            return false;
        }

        //判断用户是否存在
        Player p1 = playerMapper.findPlayerByRankAndServerId(rank,serverId);
        if (p1 == null) {
            //Log.error user is not exists;
            return false;
        }
        int ok = playerMapper.deletePlayerByRank(rank,serverId);
        if (ok != 1)
            return false;

        List<Player> players = playerMapper.findAllByServerId(p1.getServerId());

        Collections.sort(players);

        for (Player p : players) {
            if (p.getRank() > p1.getRank()) {
                int o = playerMapper.updateRankById(p.getRank() - 1, p.getId());
                //if (o==0) log.error
            }
        }
        this.ranks.clear();
        this.ranks.addAll(playerMapper.findAll());
        return true;
    }

    @Override
    public Ranks findRankById(int id) {
        if (id <= 0)
            //log.error;
            return null;
        Ranks ranks = new Ranks();

        Player p = playerMapper.findPlayerById(id);
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

        List<Player> serverRank = playerMapper.findAllByServerId(p.getServerId());

        List<Player> first = new ArrayList<>();
        for (int i = 0; i < 10 && serverRank.size() >= 10; i++) {
            first.add(serverRank.get(i));
        }
        Collections.sort(first);
        ranks.setFirst(first);

        List<Player> pre = new ArrayList<>();
        int j = 1;
        for (int i = p.getRank() - 1; j <= 10 && i - j * index >= 0; j++) {
            pre.add(serverRank.get(i - j * index));
        }
        Collections.sort(pre);
        ranks.setPre(pre);


        List<Player> after = new ArrayList<>();
        j = 0;
        for (int i = p.getRank(); j < 10 && i + j * index < serverRank.size(); j++) {
            after.add(serverRank.get(i + j * index));
        }
        Collections.sort(after);
        ranks.setAfter(after);


        return ranks;
    }

    @Override
    public int findPlayers(int serviceId) {
        return playerMapper.findPlayers(serviceId);
    }

    @Override
    public Player findPlayerById(int id) {
        return playerMapper.findPlayerById(id);
    }
}
