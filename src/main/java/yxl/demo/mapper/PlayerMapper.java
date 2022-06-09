package yxl.demo.mapper;

import org.apache.ibatis.annotations.*;
import yxl.demo.entity.Player;

import java.util.List;
import java.util.Map;

@Mapper
public interface PlayerMapper {


    @Select("SELECT id,serverId,rank FROM player ORDER BY serverId,rank")
    List<Player> findAll();

    @Select("SELECT id,serverId,rank FROM player WHERE serverId = #{serverId} ORDER BY rank")
    List<Player> findAllByServerId(@Param("serverId") int serverId);

    @Select("SELECT COUNT(1) FROM player WHERE serverID = #{serverId}")
    Integer findPlayers(@Param("serverId") int serverId);

    @Select("SELECT id,serverId,rank FROM player WHERE id = #{id}")
    Player findPlayerById(@Param("id") int id);

    @Select("SELECT id,serverId,rank FROM player WHERE rank = #{rank} and serverId = #{serverId}")
    Player findPlayerByRankAndServerId(@Param("rank") int rank,@Param("serverId")int serverId);

    @Update("UPDATE player SET rank = #{rank} WHERE id =#{id}")
    int updateRankById(@Param("rank") int rank, @Param("id") int id);

    @Insert("INSERT INTO player(serverId,rank) values(#{serverId},#{rank})")
    int insertPlayer(@Param("serverId") int serverId, @Param("rank") int rank);

    @Delete("DELETE FROM player where id = #{id}")
    int deletePlayerById(@Param("id") int id);

    @Delete("DELETE FROM player where rank = #{rank} and serverId = #{serverId}")
    int deletePlayerByRank(@Param("rank") int rank,@Param("serverId")int serverId);
}
