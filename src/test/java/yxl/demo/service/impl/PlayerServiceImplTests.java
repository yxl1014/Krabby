package yxl.demo.service.impl;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import yxl.demo.Application;
import yxl.demo.entity.Player;
import yxl.demo.entity.Ranks;
import yxl.demo.service.PlayerService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
//@Transactional
public class PlayerServiceImplTests {

    @Autowired
    private PlayerService service;

    @Test
    //@Rollback
    public void inserttest() throws Exception {
        for (int i = 0; i < 100; i++)
            service.insertPlayer(1);
        Assert.assertEquals(100, service.findPlayers(1));

        for (int i = 0; i < 1000; i++)
            service.insertPlayer(2);
        Assert.assertEquals(1000, service.findPlayers(2));

        for (int i = 0; i < 10000; i++)
            service.insertPlayer(3);
        Assert.assertEquals(10000, service.findPlayers(3));

        for (int i = 0; i < 100; i++)
            service.insertPlayer(4);
        Assert.assertEquals(100, service.findPlayers(4));
    }

    @Test
    public void rankTest() {//10561
        Ranks r = service.findRankById(10100);
        Ranks r1 = service.findRankById(10089);
        Assert.assertEquals(r.getPre().get(9), r1.getAfter().get(9));
        System.out.println(r.toString());
        System.out.println(r1.toString());
        System.out.println("-------------------------");

        Ranks r3 = service.findRankById(10561);
        Ranks r4 = service.findRankById(10550);
        Assert.assertEquals(r.getPre().get(9), r1.getAfter().get(9));
        System.out.println(r3.toString());
        System.out.println(r4.toString());
    }

    @Test
    public void deleteTest() {
        List<Player> all = service.findAllByServerId(1);
        System.out.println(all);
        System.out.println("-------------------------");

        Player p = service.findPlayerById(10037);
        Assert.assertEquals(5, p.getRank());
        boolean ok = service.deletePlayerByRank(4, 1);
        p = service.findPlayerById(10037);
        Assert.assertEquals(4, p.getRank());


        System.out.println("-------------------------");
        all = service.findAllByServerId(1);
        System.out.println(all);
    }

    @Test
    public void changeTest() {
        List<Player> all = service.findAllByServerId(1);
        System.out.println(all);
        System.out.println("-------------------------");
        service.changeRank(10031, 10032);

        Player p= service.findPlayerById(10032);
        Assert.assertEquals(1,p.getRank());

        all = service.findAllByServerId(1);
        System.out.println(all);
        System.out.println("-------------------------");
    }

}
