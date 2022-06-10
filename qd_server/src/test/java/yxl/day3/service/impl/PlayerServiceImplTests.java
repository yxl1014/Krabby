package yxl.day3.service.impl;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yxl.day3.Application;
import yxl.day3.entity.RankingCard;
import yxl.day3.entity.Ranks;
import yxl.day3.service.RankService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
//@Transactional
public class PlayerServiceImplTests {

    @Autowired
    private RankService service;

    @Test
    //@Rollback
    public void inserttest() throws Exception {
        for (int i = 0; i < 100; i++)
            service.insertRank(i + 1, 1);
        Assert.assertEquals(100, service.findRanks(1));

        for (int i = 0; i < 1000; i++)
            service.insertRank(i + 1, 2);
        Assert.assertEquals(1000, service.findRanks(2));

        for (int i = 0; i < 10000; i++)
            service.insertRank(i + 1, 3);
        Assert.assertEquals(10000, service.findRanks(3));

        for (int i = 0; i < 100; i++)
            service.insertRank(i + 1, 4);
        Assert.assertEquals(100, service.findRanks(4));
    }

    @Test
    public void rankTest() {//10561
        Ranks r = service.findRanksByUidAndServerId(20, 1);
        Ranks r1 = service.findRanksByUidAndServerId(9, 1);
        Assert.assertEquals(r.getPre().get(9), r1.getAfter().get(9));
        System.out.println(r.toString());
        System.out.println(r1.toString());
        System.out.println("-------------------------");

        Ranks r3 = service.findRanksByUidAndServerId(56, 1);
        Ranks r4 = service.findRanksByUidAndServerId(45, 1);
        Assert.assertEquals(r.getPre().get(9), r1.getAfter().get(9));
        System.out.println(r3.toString());
        System.out.println(r4.toString());
    }

    @Test
    public void deleteTest() {
        List<RankingCard> all = service.findAllByServerId(1);
        System.out.println(all);
        System.out.println("-------------------------");

        RankingCard p = service.findRankCardByUid(10);
        Assert.assertEquals(10, p.getRank());
        boolean ok = service.deleteRankByRankAndServerId(10, 1);
        p = service.findRankCardByUid(11);
        Assert.assertEquals(10, p.getRank());


        System.out.println("-------------------------");
        all = service.findAllByServerId(1);
        System.out.println(all);
    }

    @Test
    public void changeTest() {
        List<RankingCard> all = service.findAllByServerId(1);
        System.out.println(all);
        System.out.println("-------------------------");
        service.changeRank(10031, 10032);

        RankingCard p = service.findRankCardByUid(10032);
        Assert.assertEquals(1, p.getRank());

        all = service.findAllByServerId(1);
        System.out.println(all);
        System.out.println("-------------------------");
    }

}
