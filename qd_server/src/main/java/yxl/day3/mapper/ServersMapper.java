package yxl.day3.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import yxl.day3.entity.ServerCard;

@Mapper
public interface ServersMapper {

    @Insert("INSERT INTO servers(serverName) values(#{serverName})")
    int insertServer(@Param("serverName") String serverName);

    @Select("SELECT id FROM servers WHERE serverName=#{serverName}")
    Integer findIdByServerName(@Param("serverName") String serverName);

    @Select("SELECT COUNT(1) FROM servers WHERE serverName=#{serverName}")
    Integer findCOUNTByUname(@Param("serverName") String serverName);

    @Select("SELECT id,serverName FROM servers WHERE id=#{id}")
    ServerCard findServerCardById(@Param("id") int id);
}
