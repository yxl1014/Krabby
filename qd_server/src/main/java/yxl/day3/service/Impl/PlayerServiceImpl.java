package yxl.day3.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.day3.entity.ServerCard;
import yxl.day3.mapper.PlayerMapper;
import yxl.day3.mapper.ServersMapper;
import yxl.day3.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private ServersMapper serversMapper;

    @Override
    public int login(String uname, String upwd) {
        return playerMapper.findIdByUnameAndUpwd(uname, upwd);
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

        return playerMapper.insertPlayer(uname, upwd, serverId) == 1;
    }
}
