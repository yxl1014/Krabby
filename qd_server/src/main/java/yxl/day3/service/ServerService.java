package yxl.day3.service;

import org.apache.ibatis.annotations.Param;
import yxl.day3.entity.ServerCard;

public interface ServerService {

    boolean insertServer(@Param("serverName") String serverName);

    Integer findIdByServerName(@Param("serverName") String serverName);

    ServerCard findServerCardById(@Param("id") int id);
}
