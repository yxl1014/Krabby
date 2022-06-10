package yxl.day3.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.day3.controller.PlayerController;
import yxl.day3.entity.PlayerCard;
import yxl.day3.entity.ServerCard;
import yxl.day3.mapper.PlayerMapper;
import yxl.day3.mapper.RankingMapper;
import yxl.day3.mapper.ServersMapper;
import yxl.day3.service.PlayerService;
import yxl.day3.service.RankService;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private ServersMapper serversMapper;

    @Autowired
    private RankService rankService;

    @Override
    public int login(String uname, String upwd) {
        Integer i = playerMapper.findIdByUnameAndUpwd(uname, upwd);
        return i != null ? i : -1;
    }

    @Override
    public boolean logon(String uname, String upwd, int serverId) {
        ServerCard serverCard = serversMapper.findServerCardById(serverId);
        if (serverCard == null) {
            //log.error
            return false;
        }

        int count = playerMapper.findCOUNTByUname(uname);

        if (count > 0)
            return false;

        int ok1 = playerMapper.insertPlayer(uname, upwd, serverId);


        int id = playerMapper.findIdByUnameAndUpwd(uname, upwd);
        boolean ok2 = rankService.insertRank(id, serverId);


        return ok1 == 1 && ok2;
    }
}
