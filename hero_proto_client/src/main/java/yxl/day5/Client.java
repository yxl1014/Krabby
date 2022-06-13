package yxl.day5;

import com.google.protobuf.InvalidProtocolBufferException;
import yxl.day5.dto.HeroProto;
import yxl.day5.service.ClientService;


public class Client {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        ClientService service = new ClientService();
        //service.newRole(2,1,"qaz","战士");
        //service.newRole(2,1,"qaz","战士");
        //id:12
        //roleId:4
        //添加失败，详情请看日志----error:{qaz} is exist
        //Message:false


        //service.deleteRole(8);
        //Message:true


        //service.getRole(2, 1);
        //id:9
        //roleId:1

        //service.getHero(9);
        //A:200
        //D:50
        //L:500

        //service.getRoles(1);
        //id:5,uid:1,serverId:1,roleId:1,roleName:aaa,roleType:战士,A:111,D:222,L:333
        //id:7,uid:1,serverId:1,roleId:2,roleName:acacac,roleType:战士,A:333,D:444,L:555


        //service.updateHero(5, 147, 258, 369);
        //Message:true

        //service.getRoles(1);
        //id:5,uid:1,serverId:1,roleId:1,roleName:aaa,roleType:战士,A:147,D:258,L:369
        //id:7,uid:1,serverId:1,roleId:2,roleName:acacac,roleType:战士,A:333,D:444,L:555

        //service.getRoles(2);
        //id:9,uid:2,serverId:1,roleId:1,roleName:xxx,roleType:战士,A:200,D:50,L:500
        //id:10,uid:2,serverId:1,roleId:2,roleName:yyy,roleType:战士,A:200,D:50,L:500
        //id:11,uid:2,serverId:1,roleId:3,roleName:zzz,roleType:战士,A:200,D:50,L:500
        //id:12,uid:2,serverId:1,roleId:4,roleName:qaz,roleType:战士,A:200,D:50,L:500

        //service.updateRoleName(10,"ppp");
        //service.updateRoleType(11, "法师");
        //Message:true
        //Message:true

        //service.getRoles(2);
        //id:9,uid:2,serverId:1,roleId:1,roleName:xxx,roleType:战士,A:200,D:50,L:500
        //id:10,uid:2,serverId:1,roleId:2,roleName:ppp,roleType:战士,A:200,D:50,L:500
        //id:11,uid:2,serverId:1,roleId:3,roleName:zzz,roleType:法师,A:200,D:50,L:500
        //id:12,uid:2,serverId:1,roleId:4,roleName:qaz,roleType:战士,A:200,D:50,L:500


        /*for (int i = 0; i < 100; i += 3) {
            service.newRole(4, 1, String.valueOf(i), "战士");
            service.newRole(4, 1, String.valueOf(i+1), "法师");
            service.newRole(4, 1, String.valueOf(i+2), "坦克");
        }*/

        service.getRoles(4);
        //id:313,uid:4,serverId:1,roleId:1,roleName:0,roleType:战士,A:200,D:50,L:500
        //id:314,uid:4,serverId:1,roleId:2,roleName:1,roleType:法师,A:50,D:50,L:400
        //id:315,uid:4,serverId:1,roleId:3,roleName:2,roleType:坦克,A:100,D:200,L:600
        //id:316,uid:4,serverId:1,roleId:4,roleName:3,roleType:战士,A:200,D:50,L:500
        //id:317,uid:4,serverId:1,roleId:5,roleName:4,roleType:法师,A:50,D:50,L:400
        //id:318,uid:4,serverId:1,roleId:6,roleName:5,roleType:坦克,A:100,D:200,L:600
        //id:319,uid:4,serverId:1,roleId:7,roleName:6,roleType:战士,A:200,D:50,L:500
        //id:320,uid:4,serverId:1,roleId:8,roleName:7,roleType:法师,A:50,D:50,L:400
        //id:321,uid:4,serverId:1,roleId:9,roleName:8,roleType:坦克,A:100,D:200,L:600
        //id:322,uid:4,serverId:1,roleId:10,roleName:9,roleType:战士,A:200,D:50,L:500
        //id:323,uid:4,serverId:1,roleId:11,roleName:10,roleType:法师,A:50,D:50,L:400
        //id:324,uid:4,serverId:1,roleId:12,roleName:11,roleType:坦克,A:100,D:200,L:600
        //id:325,uid:4,serverId:1,roleId:13,roleName:12,roleType:战士,A:200,D:50,L:500
        //id:326,uid:4,serverId:1,roleId:14,roleName:13,roleType:法师,A:50,D:50,L:400
        //id:327,uid:4,serverId:1,roleId:15,roleName:14,roleType:坦克,A:100,D:200,L:600
        //id:328,uid:4,serverId:1,roleId:16,roleName:15,roleType:战士,A:200,D:50,L:500
        //id:329,uid:4,serverId:1,roleId:17,roleName:16,roleType:法师,A:50,D:50,L:400
        //id:330,uid:4,serverId:1,roleId:18,roleName:17,roleType:坦克,A:100,D:200,L:600
        //id:331,uid:4,serverId:1,roleId:19,roleName:18,roleType:战士,A:200,D:50,L:500
        //id:332,uid:4,serverId:1,roleId:20,roleName:19,roleType:法师,A:50,D:50,L:400
        //id:333,uid:4,serverId:1,roleId:21,roleName:20,roleType:坦克,A:100,D:200,L:600
        //id:334,uid:4,serverId:1,roleId:22,roleName:21,roleType:战士,A:200,D:50,L:500
        //id:335,uid:4,serverId:1,roleId:23,roleName:22,roleType:法师,A:50,D:50,L:400
        //id:336,uid:4,serverId:1,roleId:24,roleName:23,roleType:坦克,A:100,D:200,L:600
        //id:337,uid:4,serverId:1,roleId:25,roleName:24,roleType:战士,A:200,D:50,L:500
        //id:338,uid:4,serverId:1,roleId:26,roleName:25,roleType:法师,A:50,D:50,L:400
        //id:339,uid:4,serverId:1,roleId:27,roleName:26,roleType:坦克,A:100,D:200,L:600
        //id:340,uid:4,serverId:1,roleId:28,roleName:27,roleType:战士,A:200,D:50,L:500
        //id:341,uid:4,serverId:1,roleId:29,roleName:28,roleType:法师,A:50,D:50,L:400
        //id:342,uid:4,serverId:1,roleId:30,roleName:29,roleType:坦克,A:100,D:200,L:600
        //id:343,uid:4,serverId:1,roleId:31,roleName:30,roleType:战士,A:200,D:50,L:500
        //id:344,uid:4,serverId:1,roleId:32,roleName:31,roleType:法师,A:50,D:50,L:400
        //id:345,uid:4,serverId:1,roleId:33,roleName:32,roleType:坦克,A:100,D:200,L:600
        //id:346,uid:4,serverId:1,roleId:34,roleName:33,roleType:战士,A:200,D:50,L:500
        //id:347,uid:4,serverId:1,roleId:35,roleName:34,roleType:法师,A:50,D:50,L:400
        //id:348,uid:4,serverId:1,roleId:36,roleName:35,roleType:坦克,A:100,D:200,L:600
        //id:349,uid:4,serverId:1,roleId:37,roleName:36,roleType:战士,A:200,D:50,L:500
        //id:350,uid:4,serverId:1,roleId:38,roleName:37,roleType:法师,A:50,D:50,L:400
        //id:351,uid:4,serverId:1,roleId:39,roleName:38,roleType:坦克,A:100,D:200,L:600
        //id:352,uid:4,serverId:1,roleId:40,roleName:39,roleType:战士,A:200,D:50,L:500
        //id:353,uid:4,serverId:1,roleId:41,roleName:40,roleType:法师,A:50,D:50,L:400
        //id:354,uid:4,serverId:1,roleId:42,roleName:41,roleType:坦克,A:100,D:200,L:600
        //id:355,uid:4,serverId:1,roleId:43,roleName:42,roleType:战士,A:200,D:50,L:500
        //id:356,uid:4,serverId:1,roleId:44,roleName:43,roleType:法师,A:50,D:50,L:400
        //id:357,uid:4,serverId:1,roleId:45,roleName:44,roleType:坦克,A:100,D:200,L:600
        //id:358,uid:4,serverId:1,roleId:46,roleName:45,roleType:战士,A:200,D:50,L:500
        //id:359,uid:4,serverId:1,roleId:47,roleName:46,roleType:法师,A:50,D:50,L:400
        //id:360,uid:4,serverId:1,roleId:48,roleName:47,roleType:坦克,A:100,D:200,L:600
        //id:361,uid:4,serverId:1,roleId:49,roleName:48,roleType:战士,A:200,D:50,L:500
        //id:362,uid:4,serverId:1,roleId:50,roleName:49,roleType:法师,A:50,D:50,L:400
        //id:363,uid:4,serverId:1,roleId:51,roleName:50,roleType:坦克,A:100,D:200,L:600
        //id:364,uid:4,serverId:1,roleId:52,roleName:51,roleType:战士,A:200,D:50,L:500
        //id:365,uid:4,serverId:1,roleId:53,roleName:52,roleType:法师,A:50,D:50,L:400
        //id:366,uid:4,serverId:1,roleId:54,roleName:53,roleType:坦克,A:100,D:200,L:600
        //id:367,uid:4,serverId:1,roleId:55,roleName:54,roleType:战士,A:200,D:50,L:500
        //id:368,uid:4,serverId:1,roleId:56,roleName:55,roleType:法师,A:50,D:50,L:400
        //id:369,uid:4,serverId:1,roleId:57,roleName:56,roleType:坦克,A:100,D:200,L:600
        //id:370,uid:4,serverId:1,roleId:58,roleName:57,roleType:战士,A:200,D:50,L:500
        //id:371,uid:4,serverId:1,roleId:59,roleName:58,roleType:法师,A:50,D:50,L:400
        //id:372,uid:4,serverId:1,roleId:60,roleName:59,roleType:坦克,A:100,D:200,L:600
        //id:373,uid:4,serverId:1,roleId:61,roleName:60,roleType:战士,A:200,D:50,L:500
        //id:374,uid:4,serverId:1,roleId:62,roleName:61,roleType:法师,A:50,D:50,L:400
        //id:375,uid:4,serverId:1,roleId:63,roleName:62,roleType:坦克,A:100,D:200,L:600
        //id:376,uid:4,serverId:1,roleId:64,roleName:63,roleType:战士,A:200,D:50,L:500
        //id:377,uid:4,serverId:1,roleId:65,roleName:64,roleType:法师,A:50,D:50,L:400
        //id:378,uid:4,serverId:1,roleId:66,roleName:65,roleType:坦克,A:100,D:200,L:600
        //id:379,uid:4,serverId:1,roleId:67,roleName:66,roleType:战士,A:200,D:50,L:500
        //id:380,uid:4,serverId:1,roleId:68,roleName:67,roleType:法师,A:50,D:50,L:400
        //id:381,uid:4,serverId:1,roleId:69,roleName:68,roleType:坦克,A:100,D:200,L:600
        //id:382,uid:4,serverId:1,roleId:70,roleName:69,roleType:战士,A:200,D:50,L:500
        //id:383,uid:4,serverId:1,roleId:71,roleName:70,roleType:法师,A:50,D:50,L:400
        //id:384,uid:4,serverId:1,roleId:72,roleName:71,roleType:坦克,A:100,D:200,L:600
        //id:385,uid:4,serverId:1,roleId:73,roleName:72,roleType:战士,A:200,D:50,L:500
        //id:386,uid:4,serverId:1,roleId:74,roleName:73,roleType:法师,A:50,D:50,L:400
        //id:387,uid:4,serverId:1,roleId:75,roleName:74,roleType:坦克,A:100,D:200,L:600
        //id:388,uid:4,serverId:1,roleId:76,roleName:75,roleType:战士,A:200,D:50,L:500
        //id:389,uid:4,serverId:1,roleId:77,roleName:76,roleType:法师,A:50,D:50,L:400
        //id:390,uid:4,serverId:1,roleId:78,roleName:77,roleType:坦克,A:100,D:200,L:600
        //id:391,uid:4,serverId:1,roleId:79,roleName:78,roleType:战士,A:200,D:50,L:500
        //id:392,uid:4,serverId:1,roleId:80,roleName:79,roleType:法师,A:50,D:50,L:400
        //id:393,uid:4,serverId:1,roleId:81,roleName:80,roleType:坦克,A:100,D:200,L:600
        //id:394,uid:4,serverId:1,roleId:82,roleName:81,roleType:战士,A:200,D:50,L:500
        //id:395,uid:4,serverId:1,roleId:83,roleName:82,roleType:法师,A:50,D:50,L:400
        //id:396,uid:4,serverId:1,roleId:84,roleName:83,roleType:坦克,A:100,D:200,L:600
        //id:397,uid:4,serverId:1,roleId:85,roleName:84,roleType:战士,A:200,D:50,L:500
        //id:398,uid:4,serverId:1,roleId:86,roleName:85,roleType:法师,A:50,D:50,L:400
        //id:399,uid:4,serverId:1,roleId:87,roleName:86,roleType:坦克,A:100,D:200,L:600
        //id:400,uid:4,serverId:1,roleId:88,roleName:87,roleType:战士,A:200,D:50,L:500
        //id:401,uid:4,serverId:1,roleId:89,roleName:88,roleType:法师,A:50,D:50,L:400
        //id:402,uid:4,serverId:1,roleId:90,roleName:89,roleType:坦克,A:100,D:200,L:600
        //id:403,uid:4,serverId:1,roleId:91,roleName:90,roleType:战士,A:200,D:50,L:500
        //id:404,uid:4,serverId:1,roleId:92,roleName:91,roleType:法师,A:50,D:50,L:400
        //id:405,uid:4,serverId:1,roleId:93,roleName:92,roleType:坦克,A:100,D:200,L:600
        //id:406,uid:4,serverId:1,roleId:94,roleName:93,roleType:战士,A:200,D:50,L:500
        //id:407,uid:4,serverId:1,roleId:95,roleName:94,roleType:法师,A:50,D:50,L:400
        //id:408,uid:4,serverId:1,roleId:96,roleName:95,roleType:坦克,A:100,D:200,L:600
        //id:409,uid:4,serverId:1,roleId:97,roleName:96,roleType:战士,A:200,D:50,L:500
        //id:410,uid:4,serverId:1,roleId:98,roleName:97,roleType:法师,A:50,D:50,L:400
        //id:411,uid:4,serverId:1,roleId:99,roleName:98,roleType:坦克,A:100,D:200,L:600
        //id:412,uid:4,serverId:1,roleId:100,roleName:99,roleType:战士,A:200,D:50,L:500
        //id:413,uid:4,serverId:1,roleId:101,roleName:100,roleType:法师,A:50,D:50,L:400
        //id:414,uid:4,serverId:1,roleId:102,roleName:101,roleType:坦克,A:100,D:200,L:600
    }
}
