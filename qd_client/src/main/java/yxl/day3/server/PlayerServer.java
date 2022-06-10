package yxl.day3.server;

import yxl.day3.dto.PlayerProto;
import yxl.day3.dto.RankProto;
import yxl.day3.dto.RegisterProto;
import yxl.day3.dto.ServerProto;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PlayerServer {

    private final RegisterProto.register.Builder registerBuilder = RegisterProto.register.newBuilder();

    private final PlayerProto.player.Builder playerBuilder = PlayerProto.player.newBuilder();

    private final ServerProto.server.Builder serverbuilder = ServerProto.server.newBuilder();

    private final RankProto.rank.Builder rankBuilder = RankProto.rank.newBuilder();

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    private final String url = "http://localhost:14253/";

    public void register(int uid, String time) throws ParseException {
        registerBuilder.setUid(uid);
        registerBuilder.setTime(sdf.parse(time).getTime());

        RegisterProto.register register = registerBuilder.build();
        System.out.println(register);

        byte[] registerbyte = register.toByteArray();
        String result = sendHttp(registerbyte, "register");
        System.out.println(result);
    }

    public void register(int uid) {
        registerBuilder.setUid(uid);
        registerBuilder.setTime(System.currentTimeMillis());

        RegisterProto.register register = registerBuilder.build();
        byte[] registerbyte = register.toByteArray();
        String result = sendHttp(registerbyte, "register");
        System.out.println(result);
    }

    public void login(String name, String pwd) {
        playerBuilder.setUname(name);
        playerBuilder.setUpwd(pwd);

        byte[] date = playerBuilder.build().toByteArray();
        String result = sendHttp(date, "login");
        System.out.println(result);
    }

    public void logon(String name, String pwd, int serverId) {
        playerBuilder.setUname(name);
        playerBuilder.setUpwd(pwd);
        playerBuilder.setServerId(serverId);

        byte[] date = playerBuilder.build().toByteArray();
        String result = sendHttp(date, "logon");
        System.out.println(result);
    }

    public void addServer(String name) {
        serverbuilder.setServerName(name);

        byte[] date = serverbuilder.build().toByteArray();
        String result = sendHttp(date, "addServer");
        System.out.println(result);
    }

    public void findIdByServerName(String name) {
        serverbuilder.setServerName(name);

        byte[] date = serverbuilder.build().toByteArray();
        String result = sendHttp(date, "findIdByServerName");
        System.out.println(result);
    }

    public void getRanks(int uid, int serverID) {
        rankBuilder.setUid(uid);
        rankBuilder.setServerId(serverID);

        byte[] date = rankBuilder.build().toByteArray();
        String result = sendHttp(date, "getRanks");
        System.out.println(result);
    }

    public void fight(int uid1, int uid2) {
        rankBuilder.setUid(uid1);
        rankBuilder.setUid2(uid2);

        byte[] date = rankBuilder.build().toByteArray();
        String result = sendHttp(date, "fight");
        System.out.println(result);
    }


    private String sendHttp(byte[] data, String controller) {
        OutputStream out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL realUrl = new URL(url + controller);
            // 打开和URL之间的连接
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();

            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Content-Type", "binary/octet-stream");
            connection.connect();

            out = connection.getOutputStream();

            // 发送请求参数，防止中文乱码
            out.write(data);
            // flush输出流的缓冲
            out.flush();

            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }

        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！");
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return result.toString();
    }


}
