package yxl.day4;

import com.google.protobuf.InvalidProtocolBufferException;
import yxl.day4.server.PropsServer;

public class Client {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        PropsServer server = new PropsServer();
        //server.clear();
        //server.obtain(1);
        //[{"id":32,"name":"方天画戟","level":2,"ownership":1,"gold":1333,"isPick":false},
        // {"id":33,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":false},
        // {"id":34,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":false},
        // {"id":35,"name":"长八蛇矛","level":4,"ownership":1,"gold":40,"isPick":false},
        // {"id":36,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":false}]

        //server.show(1);
        //[]

        //server.pick(32, 1);
        //true
        //拾取成功

        //server.show(1);
        //[{"id":32,"name":"方天画戟","level":2,"ownership":1,"gold":1333,"isPick":true}]

        //server.pick(32, 1);
        //false
        //物品已被拾取

        //server.show(1);
        //[{"id":32,"name":"方天画戟","level":2,"ownership":1,"gold":1333,"isPick":true}]

        //server.pick(33, 1);
        //server.pick(34, 1);
        //server.pick(35, 1);
        //server.pick(36, 1);
        //true
        //拾取成功
        //true
        //拾取成功
        //true
        //拾取成功
        //true
        //拾取成功

        //server.show(1);
        //[{"id":32,"name":"方天画戟","level":2,"ownership":1,"gold":1333,"isPick":true},
        // {"id":33,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true},
        // {"id":34,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true},
        // {"id":35,"name":"长八蛇矛","level":4,"ownership":1,"gold":40,"isPick":true},
        // {"id":36,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true}]

        //server.pthrow(35, 1);
        //true

        //server.show(1);
        //[{"id":32,"name":"方天画戟","level":2,"ownership":1,"gold":1333,"isPick":true},
        // {"id":33,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true},
        // {"id":34,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true},
        // {"id":36,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true}]


        //server.showNoPick();
        //[{"id":35,"name":"长八蛇矛","level":4,"ownership":0,"gold":40,"isPick":false}]

        //server.pthrow(35, 1);
        //false
        //该物品没有被拾取

        //server.destroy(33,1);
        //true

        //server.show(1);
        //[{"id":32,"name":"方天画戟","level":2,"ownership":1,"gold":1333,"isPick":true},
        // {"id":34,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true},
        // {"id":36,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true}]

        //server.give(34, 1, 2);
        //true

        //server.give(34, 1, 2);
        //false
        //该物品不属于你

        //server.show(1);
        //[{"id":32,"name":"方天画戟","level":2,"ownership":1,"gold":1333,"isPick":true},
        // {"id":36,"name":"长八蛇矛","level":3,"ownership":1,"gold":66,"isPick":true}]

        //server.show(2);
        //[{"id":34,"name":"长八蛇矛","level":3,"ownership":2,"gold":66,"isPick":true}]
    }
}
