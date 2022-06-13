package yxl.day5.Service.impl;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yxl.day5.Application;
import yxl.day5.Serivce.RoleService;
import yxl.day5.entity.Hero;
import yxl.day5.entity.Role;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class RoleTest {

    @Autowired
    private RoleService service;

    @Test
    public void insertTest() {

        Role r1 = service.newRole(1, 1, "aaa", "战士");

        Assert.assertEquals(r1.getId(), 5);
        Assert.assertEquals(r1.getRoleId(), 1);


        Role r = service.newRole(1, 1, "bbb", "法师");

        Assert.assertEquals(r.getId(), 6);
        Assert.assertEquals(r.getRoleId(), 2);

        Role rr = service.newRole(1, 1, "ccc", "坦克");

        Assert.assertEquals(rr.getId(), 7);
        Assert.assertEquals(rr.getRoleId(), 3);

        Role rrr = service.newRole(1, 1, "ccc", "坦克");

        Assert.assertNull(rrr);
    }

    @Test
    public void demo() {
        Role r1 = service.newRole(1, 1, "aaaaaaaa", "战士");
        Assert.assertNotNull(r1);
    }

    @Test
    public void deleteTest() {
        boolean b1 = service.deleteRoleById(6);
        Assert.assertTrue(b1);

        boolean b2 = service.deleteRoleById(6);
        Assert.assertFalse(b2);
    }

    @Test
    public void selectTest() throws InvalidProtocolBufferException {
        List<Role> list = service.getRolesByUid(1);
        Assert.assertEquals(list.size(), 3);

        Role r1 = service.getRoleByUidAndRid(1, 1);
        Assert.assertNotNull(r1);

        Role r2 = service.getRoleByUidAndRid(1, 2);
        Assert.assertNull(r2);

        Hero h = service.getHeroById(5);
        Assert.assertEquals(h.getAttack(), 200);
        Assert.assertEquals(h.getDefense(), 50);
        Assert.assertEquals(h.getLife(), 500);
    }

    @Test
    public void updateTest() throws InvalidProtocolBufferException {
        Role role = service.getRoleByUidAndRid(1, 2);
        Assert.assertEquals("ccc", role.getRoleName());
        Assert.assertEquals("坦克", role.getRoleType());


        boolean b1 = service.updateHeroById(7, 333, 444, 555);
        Assert.assertTrue(b1);
        Hero h = service.getHeroById(7);
        Assert.assertEquals(h.getAttack(), 333);
        Assert.assertEquals(h.getDefense(), 444);
        Assert.assertEquals(h.getLife(), 555);

        boolean b2 = service.updateRoleNameById(7, "acacac");
        Assert.assertTrue(b2);
        boolean b3 = service.updateRoleTypeById(7, "战士");
        Assert.assertTrue(b3);

        Role role1 = service.getRoleByUidAndRid(1, 2);
        Assert.assertEquals("acacac", role1.getRoleName());
        Assert.assertEquals("战士", role1.getRoleType());

    }
}
