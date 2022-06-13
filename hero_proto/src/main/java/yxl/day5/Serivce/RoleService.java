package yxl.day5.Serivce;

import com.google.protobuf.InvalidProtocolBufferException;
import yxl.day5.entity.Hero;
import yxl.day5.entity.Role;

import java.util.List;

public interface RoleService {
    Role newRole(int uid, int serverId, String roleName, String roleType);


    boolean deleteRoleById(int id);


    Role getRoleByUidAndRid(int uid, int roleId);

    Hero getHeroById(int id) throws InvalidProtocolBufferException;


    List<Role> getRolesByUid(int uid);


    boolean updateHeroById(int id, long attack, long defense, long life);

    boolean updateRoleNameById(int id,String roleName);

    boolean updateRoleTypeById(int id,String roleType);
}
