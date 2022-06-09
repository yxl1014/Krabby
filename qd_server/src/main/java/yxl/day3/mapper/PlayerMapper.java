package yxl.day3.mapper;

import org.apache.ibatis.annotations.*;
import yxl.day3.entity.RegisterCard;

@Mapper
public interface PlayerMapper {

    @Select("SELECT id,uid,y,m,maps FROM register WHERE uid = #{uid} and y = #{y} and m = #{m}")
    public RegisterCard findRegisterCardByUidAndYAndM(@Param("uid") int uid, @Param("y") int y, @Param("m") int m);

    @Insert("INSERT INTO register(uid,y,m,maps) VALUES(#{uid},#{y},#{m},#{maps})")
    void insertRegister(@Param("uid") int uid, @Param("y") int y, @Param("m") int m,@Param("maps")int maps);

    @Update("UPDATE register SET maps = #{map} WHERE uid = #{uid} and y = #{y} and m = #{m}")
    void updateMapsByUidAndYAndM(@Param("map") int map, @Param("uid") int uid, @Param("y") int y, @Param("m") int m);

    @Select("SELECT id,uid,y,m,maps FROM register WHERE id = #{id}")
    RegisterCard findRegisterCardById(@Param("id")int id);
}
