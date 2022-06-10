package yxl.day4.mapper;

import org.apache.ibatis.annotations.*;
import yxl.day4.entity.Props;

import java.util.List;

@Mapper
public interface PropsMapper {
    @Delete("DELETE FROM props WHERE isPick = 0")
    void clear();

    @Delete("DELETE FROM props WHERE id = #{id}")
    Integer deleteById(@Param("id") int id);

    @Select("SELECT COUNT(1) FROM props WHERE id = #{id} AND ownership = #{ownership}")
    Integer findCountByIdAndOwnership(@Param("id") int id, @Param("ownership") int ownership);

    @Update("UPDATE props SET ownership = #{ownership} WHERE id = #{id}")
    Integer updateOwnershipById(@Param("ownership") int ownership, @Param("id") int id);

    @Update("UPDATE props SET isPick = #{isPick} WHERE id = #{id}")
    Integer updateIsPickById(@Param("isPick")boolean isPick,@Param("id") int id);

    @Insert("INSERT INTO props(name,level,ownership,gold) values(#{name},#{level},#{ownership},#{gold})")
    int insertProps(@Param("name")String name,@Param("level") int level,@Param("ownership") int ownership,@Param("gold") int gold);

    @Select("SELECT id,name,level,ownership,gold,isPick FROM props WHERE ownership = #{ownership}")
    List<Props> findPropsByUidAndNoPick(@Param("ownership")int ownership);
}
