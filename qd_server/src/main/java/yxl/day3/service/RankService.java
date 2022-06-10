package yxl.day3.service;

import com.google.protobuf.InvalidProtocolBufferException;
import yxl.day3.entity.RankingCard;
import yxl.day3.entity.Ranks;

import java.util.List;

public interface RankService {

    List<RankingCard> findAll();

    List<RankingCard> findAllByServerId(int serverId);

    boolean changeRank(int id1, int id2);

    boolean insertRank(int uid, int serverId);

    boolean deleteRankByUidAndServerId(int id);

    boolean deleteRankByRankAndServerId(int rank, int serverId);

    Ranks findRanksByUidAndServerId(int id,int serverId);

    int findRanks(int serviceId);

    RankingCard findRankCardByUid(int id);
}
