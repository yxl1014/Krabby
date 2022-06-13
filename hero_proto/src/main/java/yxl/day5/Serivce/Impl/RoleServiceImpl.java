package yxl.day5.Serivce.Impl;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.day5.Serivce.RoleService;
import yxl.day5.dto.HeroProto;
import yxl.day5.entity.Hero;
import yxl.day5.entity.Role;
import yxl.day5.mapper.RoleMapper;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public Role getRoleByUidAndRid(int uid, int roleId) {
        //TODO uid is exist

        return roleMapper.getRoleByUidAndRid(uid, roleId);
    }

    @Override
    public Hero getHeroById(int id) throws InvalidProtocolBufferException {
        Role role = roleMapper.getRoleById(id);

        if (role == null) {
            System.out.println("error:{" + id + "} is not exist");
            return null;
        }
        byte[] temp = role.getHero();
        int len = role.getHeroLen();

        byte[] hero = new byte[len];
        System.arraycopy(temp, 0, hero, 0, len);

        HeroProto.Hero hero1 = HeroProto.Hero.parseFrom(hero);

        return new Hero(hero1.getAttack(), hero1.getDefense(), hero1.getLife());
    }

    @Override
    public List<Role> getRolesByUid(int uid) {
        //TODO uid is exist

        return roleMapper.getRolesByUid(uid);
    }

    @Override
    public Role newRole(int uid, int serverId, String roleName, String roleType) {
        //TODO uid is exist
        //TODO serverId is exist

        Role r = roleMapper.getRoleByUidAndRoleName(uid, roleName);
        if (r != null) {
            System.out.println("error:{" + roleName + "} is exist");
            return null;
        }

        int len = roleMapper.getCountByUid(uid) + 1;

        byte[] hero = defaultHero(roleType);
        int heroLen = hero.length;

        int ok = roleMapper.insertRole(new Role(uid, serverId, len, roleName, roleType, hero, heroLen));

        if (ok != 1) {
            System.out.println("error: mysql insert error");
            return null;
        }

        return roleMapper.getRoleByUidAndRoleName(uid, roleName);
    }

    @Override
    public boolean deleteRoleById(int id) {

        Role role = roleMapper.getRoleById(id);

        if (role == null) {
            System.out.println("error:{" + id + "} is not exist");
            return false;
        }
        int ok = roleMapper.deleteRoleById(id);
        if (ok != 1) {
            System.out.println("error: mysql update error");
            return false;
        }

        //TODO 可以在数据库中设置自增，就不需要下面的代码
        List<Role> roles = roleMapper.getRolesByUid(role.getUid());
        for (Role r : roles) {
            if (r.getRoleId() > role.getRoleId()) {
                int roleId = r.getRoleId();
                roleMapper.updateRoleIdById(r.getId(), --roleId);
            }
        }

        return true;
    }

    @Override
    public boolean updateHeroById(int id, long attack, long defense, long life) {
        Role role = roleMapper.getRoleById(id);

        if (role == null) {
            System.out.println("error:{" + id + "} is not exist");
            return false;
        }

        HeroProto.Hero.Builder builder = HeroProto.Hero.newBuilder();
        builder.setAttack(attack);
        builder.setDefense(defense);
        builder.setLife(life);
        byte[] hero = builder.build().toByteArray();
        int len = hero.length;

        int ok = roleMapper.updateHeroById(id, hero);
        int ok1 = roleMapper.updateHeroLenById(id, len);

        if (ok != 1 || ok1 != 1) {
            System.out.println("error: mysql update error");
            return false;
        }
        return true;
    }

    @Override
    public boolean updateRoleNameById(int id, String roleName) {
        if (roleName.isEmpty()) {
            System.out.println("error: roleName is null");
            return false;
        }

        Role role = roleMapper.getRoleById(id);

        if (role == null) {
            System.out.println("error:{" + id + "} is not exist");
            return false;
        }

        int ok = roleMapper.updateRoleNameById(id, roleName);

        if (ok != 1) {
            System.out.println("error: mysql update error");
            return false;
        }
        return true;
    }

    @Override
    public boolean updateRoleTypeById(int id, String roleType) {
        if (roleType.isEmpty()) {
            System.out.println("error: roleType is null");
            return false;
        }

        Role role = roleMapper.getRoleById(id);

        if (role == null) {
            System.out.println("error:{" + id + "} is not exist");
            return false;
        }

        int ok = roleMapper.updateRoleTypeById(id, roleType);
        //TODO changeHero

        if (ok != 1) {
            System.out.println("error: mysql update error");
            return false;
        }
        return true;
    }


    private byte[] defaultHero(String roleType) {
        HeroProto.Hero.Builder builder = HeroProto.Hero.newBuilder();
        switch (roleType) {
            case "战士":
                builder.setAttack(200);
                builder.setDefense(50);
                builder.setLife(500);
                break;
            case "法师":
                builder.setAttack(50);
                builder.setDefense(50);
                builder.setLife(400);
                break;
            case "坦克":
                builder.setAttack(100);
                builder.setDefense(200);
                builder.setLife(600);
                break;
            default:
                System.out.println("error:{" + roleType + "}该职业不存在");
                builder.setAttack(150);
                builder.setDefense(150);
                builder.setLife(150);
        }
        return builder.build().toByteArray();
    }

}
