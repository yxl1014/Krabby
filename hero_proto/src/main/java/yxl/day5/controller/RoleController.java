package yxl.day5.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yxl.day5.Serivce.RoleService;
import yxl.day5.dto.HeroProto;
import yxl.day5.entity.Hero;
import yxl.day5.entity.Role;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("newRole")
    @ResponseBody
    public byte[] newRole(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);
        Role role1 = roleService.newRole(role.getUid(0), role.getServerId(0), role.getRoleName(0), role.getRoleType(0));
        HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();
        if (role1 == null) {
            builder.setMessage("添加失败，详情请看日志");
        } else {
            builder.addId(role1.getId());
            builder.addUid(role1.getUid());
            builder.addServerId(role1.getServerId());
            builder.addRoleId(role1.getRoleId());
            builder.addRoleName(role1.getRoleName());
            builder.addRoleType(role1.getRoleType());

            byte[] heroByte = new byte[role1.getHeroLen()];

            System.arraycopy(role1.getHero(), 0, heroByte, 0, role1.getHeroLen());
            HeroProto.Hero hero = HeroProto.Hero.parseFrom(heroByte);

            builder.addHero(hero);
            builder.addHeroLen(role1.getHeroLen());
        }


        return builder.build().toByteArray();
    }

    @PostMapping("deleteRole")
    @ResponseBody
    public byte[] deleteRole(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);
        boolean b = roleService.deleteRoleById(role.getId(0));

        HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();

        builder.setMessage(String.valueOf(b));
        return builder.build().toByteArray();
    }

    @PostMapping("getRole")
    @ResponseBody
    public byte[] getRole(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);

        Role role1 = roleService.getRoleByUidAndRid(role.getUid(0), role.getRoleId(0));

        HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();

        if (role1 == null) {
            builder.setMessage("添加失败，详情请看日志");
        } else {
            builder.addId(role1.getId());
            builder.addUid(role1.getUid());
            builder.addServerId(role1.getServerId());
            builder.addRoleId(role1.getRoleId());
            builder.addRoleName(role1.getRoleName());
            builder.addRoleType(role1.getRoleType());

            byte[] heroByte = new byte[role1.getHeroLen()];

            System.arraycopy(role1.getHero(), 0, heroByte, 0, role1.getHeroLen());
            HeroProto.Hero hero = HeroProto.Hero.parseFrom(heroByte);

            builder.addHero(hero);
            builder.addHeroLen(role1.getHeroLen());
        }

        return builder.build().toByteArray();
    }

    @PostMapping("getHero")
    @ResponseBody
    public byte[] getHero(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);

        Hero hero = roleService.getHeroById(role.getId(0));

        HeroProto.Role.Builder builder1 = HeroProto.Role.newBuilder();
        HeroProto.Hero.Builder builder = HeroProto.Hero.newBuilder();

        if (hero == null) {
            builder1.setMessage("错误，详情请看日志");
        } else {
            builder.setAttack(hero.getAttack());
            builder.setDefense(hero.getDefense());
            builder.setLife(hero.getLife());
            builder1.addHero(builder.build());
        }

        return builder1.build().toByteArray();
    }


    @PostMapping("getRoles")
    @ResponseBody
    public byte[] getRoles(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);

        List<Role> roles = roleService.getRolesByUid(role.getUid(0));

        HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();

        for (Role r : roles) {
            builder.addId(r.getId());
            builder.addUid(r.getUid());
            builder.addServerId(r.getServerId());
            builder.addRoleId(r.getRoleId());
            builder.addRoleName(r.getRoleName());
            builder.addRoleType(r.getRoleType());

            byte[] heroByte = new byte[r.getHeroLen()];

            System.arraycopy(r.getHero(), 0, heroByte, 0, r.getHeroLen());
            HeroProto.Hero hero = HeroProto.Hero.parseFrom(heroByte);

            builder.addHero(hero);
            builder.addHeroLen(r.getHeroLen());
        }
        return builder.build().toByteArray();
    }

    @PostMapping("updateHero")
    @ResponseBody
    public byte[] updateHero(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);

        boolean b = roleService.updateHeroById(role.getId(0), role.getHero(0).getAttack(), role.getHero(0).getDefense(), role.getHero(0).getLife());

        HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();

        builder.setMessage(String.valueOf(b));

        return builder.build().toByteArray();
    }


    @PostMapping("updateRoleName")
    @ResponseBody
    public byte[] updateRoleName(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);

        boolean b = roleService.updateRoleNameById(role.getId(0), role.getRoleName(0));

        HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();

        builder.setMessage(String.valueOf(b));

        return builder.build().toByteArray();
    }

    @PostMapping("updateRoleType")
    @ResponseBody
    public byte[] updateRoleType(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        HeroProto.Role role = HeroProto.Role.parseFrom(data);

        boolean b = roleService.updateRoleTypeById(role.getId(0), role.getRoleType(0));

        HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();

        builder.setMessage(String.valueOf(b));

        return builder.build().toByteArray();
    }
}
