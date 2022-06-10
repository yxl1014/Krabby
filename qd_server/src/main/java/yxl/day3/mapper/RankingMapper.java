package yxl.day3.mapper;

import org.apache.ibatis.annotations.*;
import yxl.day3.entity.RankingCard;

import java.util.List;

@Mapper
public interface RankingMapper {
    @Select("SELECT id,uid,serverId,rank FROM ranking ORDER BY serverId,rank")
    List<RankingCard> findAll();

    @Select("SELECT id,uid,serverId,rank FROM ranking WHERE serverId = #{serverId} ORDER BY rank")
    List<RankingCard> findAllByServerId(@Param("serverId") int serverId);

    @Select("SELECT COUNT(1) FROM ranking WHERE serverID = #{serverId}")
    Integer findRanks(@Param("serverId") int serverId);

    @Select("SELECT id,uid,serverId,rank FROM ranking WHERE uid = #{uid} AND serverId = #{serverId}")
    RankingCard findRankCardByUidAndServerId(@Param("uid") int uid,@Param("serverId")int serverId);

    @Select("SELECT id,uid,serverId,rank FROM ranking WHERE rank = #{rank} and serverId = #{serverId}")
    RankingCard findRankCardByRankAndServerId(@Param("rank") int rank, @Param("serverId")int serverId);

    @Update("UPDATE ranking SET rank = #{rank} WHERE uid =#{uid} AND serverId = #{serverId}")
    int updateRankByUidAndServerId(@Param("rank") int rank, @Param("uid") int uid, @Param("serverId") int serverId);

    @Insert("INSERT INTO ranking(uid,serverId,rank) values(#{uid},#{serverId},#{rank})")
    int insertRank(@Param("uid") int uid, @Param("serverId") int serverId, @Param("rank") int rank);

    @Delete("DELETE FROM ranking where uid = #{uid} AND serverId = #{serverId}")
    int deleteRankByUidAndServerId(@Param("uid") int uid, @Param("serverId")int serverId);

    @Delete("DELETE FROM ranking where rank = #{rank} AND serverId = #{serverId}")
    int deleteRankByRankAndServerId(@Param("rank") int rank, @Param("serverId")int serverId);
}
