package yxl.day5.mapper;

import org.apache.ibatis.annotations.*;
import yxl.day5.entity.Role;

import java.util.List;

@Mapper
public interface RoleMapper {

    @Select("SELECT id,uid,serverId,roleId,roleName,roleType,hero,heroLen FROM role WHERE uid = #{uid} AND roleId = #{roleId}")
    Role getRoleByUidAndRid(@Param("uid") int uid, @Param("roleId") int roleId);

    @Select("SELECT id,uid,serverId,roleId,roleName,roleType,hero,heroLen FROM role WHERE id = #{id}")
    Role getRoleById(@Param("id") int id);

    @Select("SELECT id,uid,serverId,roleId,roleName,roleType,hero,heroLen FROM role WHERE uid = #{uid} AND roleName = #{roleName}")
    Role getRoleByUidAndRoleName(@Param("uid") int uid, @Param("roleName") String roleName);

    @Select("SELECT COUNT(1) FROM role WHERE uid= #{uid}")
    int getCountByUid(@Param("uid") int uid);

    @Insert("INSERT INTO role(uid,serverId,roleId,roleName,roleType,hero,heroLen) VALUES(#{uid},#{serverId},#{roleId},#{roleName},#{roleType},#{hero},#{heroLen})")
    int insertRole(Role role);

    @Delete("DELETE FROM role WHERE id = #{id}")
    int deleteRoleById(@Param("id") int id);

    @Update("UPDATE role SET hero = #{hero} WHERE id = #{id}")
    int updateHeroById(@Param("id") int id, @Param("hero") byte[] hero);

    @Update("UPDATE role SET roleName = #{roleName} WHERE id = #{id}")
    int updateRoleNameById(@Param("id") int id, @Param("roleName") String roleName);

    @Update("UPDATE role SET roleType = #{roleType} WHERE id = #{id}")
    int updateRoleTypeById(@Param("id") int id, @Param("roleType") String roleType);

    @Update("UPDATE role SET heroLen = #{heroLen} WHERE id = #{id}")
    int updateHeroLenById(@Param("id") int id, @Param("heroLen") int heroLen);

    @Select("SELECT id,uid,serverId,roleId,roleName,roleType,hero,heroLen FROM role WHERE uid = #{uid}")
    List<Role> getRolesByUid(@Param("uid") int uid);

    @Update("UPDATE role SET roleId = #{roleId} WHERE id = #{id}")
    void updateRoleIdById(@Param("id") int id, @Param("roleId") int roleId);
}
