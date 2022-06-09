package yxl.demo.service;


import yxl.demo.entity.Player;
import yxl.demo.entity.Ranks;

import java.util.List;

public interface PlayerService {
    List<Player> findAll();

    List<Player> findAllByServerId(int serverId);

    boolean changeRank(int id1, int id2);

    boolean insertPlayer(int serverId);

    boolean deletePlayerById(int id);

    boolean deletePlayerByRank(int rank,int serverId);

    Ranks findRankById(int id);

    int findPlayers(int serviceId);

    Player findPlayerById(int id);
}
