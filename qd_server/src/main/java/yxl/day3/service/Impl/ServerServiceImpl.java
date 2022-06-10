package yxl.day3.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.day3.entity.ServerCard;
import yxl.day3.mapper.ServersMapper;
import yxl.day3.service.ServerService;

@Service
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServersMapper serversMapper;

    @Override
    public boolean insertServer(String serverName) {
        int countByUname = serversMapper.findCOUNTByUname(serverName);
        if (countByUname > 0) {
            //log.error
            return false;
        }

        return serversMapper.insertServer(serverName) == 1;
    }

    @Override
    public Integer findIdByServerName(String serverName) {
        return serversMapper.findIdByServerName(serverName);
    }

    @Override
    public ServerCard findServerCardById(int id) {
        return serversMapper.findServerCardById(id);
    }
}
