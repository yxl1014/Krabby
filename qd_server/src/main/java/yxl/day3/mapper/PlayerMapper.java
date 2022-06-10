package yxl.day3.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import yxl.day3.entity.PlayerCard;

@Mapper
public interface PlayerMapper {

    @Insert("INSERT INTO player(uname,upwd,serverId) values(#{uname},#{upwd},#{serverId})")
    int insertPlayer(@Param("uname") String uname, @Param("upwd") String upwd, @Param("serverId") int serverId);

    @Select("SELECT id FROM player WHERE uname=#{uname} AND upwd = #{upwd}")
    Integer findIdByUnameAndUpwd(@Param("uname") String uname, @Param("upwd") String upwd);

    @Select("SELECT COUNT(1) FROM player WHERE uname=#{uname}")
    Integer findCOUNTByUname(@Param("uname") String uname);

    @Select("SELECT id,uname,upwd,serverID FROM player WHERE id=#{id}")
    PlayerCard findIdById(@Param("id") int id);
}
