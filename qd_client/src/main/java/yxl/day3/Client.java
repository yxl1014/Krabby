package yxl.day3;

import yxl.day3.server.PlayerServer;

import java.text.ParseException;

public class Client {
    public static void main(String[] args) throws ParseException {
        PlayerServer server = new PlayerServer();
        //server.addServer("aaa");
        //server.addServer("bbb");
        //server.addServer("ccc");
        //ok
        //ok
        //ok
        //server.findIdByServerName("aaa");
        //server.findIdByServerName("bbb");
        //server.findIdByServerName("ccc");
        //1
        //2
        //3
        //server.logon("qwe","123",1);
        //server.logon("asd","123",1);
        //server.logon("zxc","123",1);
        //ok
        //ok
        //ok
        //server.login("qwe","123");
        //server.login("asd","123");
        //server.login("zxc","123");
        //server.login("qwe","456");
        //1
        //2
        //3
        //error
        //server.register(1);
        //server.register(1);
        //server.register(2);
        //server.register(2);
        //server.register(3);
        //server.register(3);
        //2022年6月，签到：1天
        //您已签到
        //2022年6月，签到：1天
        //您已签到
        //2022年6月，签到：1天
        //您已签到
        //server.getRanks(1,1);
        //server.getRanks(2,1);
        //server.getRanks(3,1);
        //{"first":[{"id":11204,"uid":1,"serverId":1,"rank":1},{"id":11205,"uid":2,"serverId":1,"rank":2},{"id":11206,"uid":3,"serverId":1,"rank":3}],
        // "pre":[],
        // "self":{"id":11204,"uid":1,"serverId":1,"rank":1},
        // "after":[{"id":11205,"uid":2,"serverId":1,"rank":2},{"id":11206,"uid":3,"serverId":1,"rank":3}]}

        //{"first":[{"id":11204,"uid":1,"serverId":1,"rank":1},{"id":11205,"uid":2,"serverId":1,"rank":2},{"id":11206,"uid":3,"serverId":1,"rank":3}],
        // "pre":[{"id":11204,"uid":1,"serverId":1,"rank":1}],
        // "self":{"id":11205,"uid":2,"serverId":1,"rank":2},
        // "after":[{"id":11206,"uid":3,"serverId":1,"rank":3}]}

        //{"first":[{"id":11204,"uid":1,"serverId":1,"rank":1},{"id":11205,"uid":2,"serverId":1,"rank":2},{"id":11206,"uid":3,"serverId":1,"rank":3}],
        // "pre":[{"id":11204,"uid":1,"serverId":1,"rank":1},{"id":11205,"uid":2,"serverId":1,"rank":2}],
        // "self":{"id":11206,"uid":3,"serverId":1,"rank":3},
        // "after":[]}


        //server.getRanks(2,1);
        //{"first":[{"id":11204,"uid":1,"serverId":1,"rank":1},{"id":11205,"uid":2,"serverId":1,"rank":2},{"id":11206,"uid":3,"serverId":1,"rank":3}],
        // "pre":[{"id":11204,"uid":1,"serverId":1,"rank":1}],
        // "self":{"id":11205,"uid":2,"serverId":1,"rank":2},
        // "after":[{"id":11206,"uid":3,"serverId":1,"rank":3}]}

        //server.fight(1,3);
        //ok

        //server.getRanks(2,1);
        //{"first":[{"id":11206,"uid":3,"serverId":1,"rank":1},{"id":11205,"uid":2,"serverId":1,"rank":2},{"id":11204,"uid":1,"serverId":1,"rank":3}],
        // "pre":[{"id":11206,"uid":3,"serverId":1,"rank":1}],
        // "self":{"id":11205,"uid":2,"serverId":1,"rank":2},
        // "after":[{"id":11204,"uid":1,"serverId":1,"rank":3}]}


    }
}
