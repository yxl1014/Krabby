package yxl.day5.service;

import com.google.protobuf.InvalidProtocolBufferException;
import yxl.day5.dto.HeroProto;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientService {

    private final HeroProto.Role.Builder builder = HeroProto.Role.newBuilder();

    private final String url = "http://localhost:14563/";

    public void newRole(int uid, int serverId, String roleName, String roleType) throws InvalidProtocolBufferException {
        builder.clear();


        builder.addUid(uid);
        builder.addServerId(serverId);
        builder.addRoleName(roleName);
        builder.addRoleType(roleType);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "newRole");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);
        if (role.getHeroCount() <= 0) {
            System.out.println(role.getMessage());
            return;
        }
        System.out.println("id:" + role.getId(0));
        System.out.println("roleId:" + role.getRoleId(0));
    }


    public void deleteRole(int id) throws InvalidProtocolBufferException {
        builder.clear();

        builder.addId(id);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "deleteRole");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);

        if (!Boolean.getBoolean(role.getMessage())) {
            System.out.println("删除失败，详情请看日志");
            return;
        }
        System.out.println("Message:" + role.getMessage());
    }

    public void getRole(int uid, int roleId) throws InvalidProtocolBufferException {
        builder.clear();

        builder.addUid(uid);
        builder.addRoleId(roleId);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "getRole");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);


        if (role.getHeroCount() <= 0) {
            System.out.println(role.getMessage());
            return;
        }
        System.out.println("id:" + role.getId(0));
        System.out.println("roleId:" + role.getRoleId(0));
    }

    public void getRoles(int uid) throws InvalidProtocolBufferException {
        builder.clear();

        builder.addUid(uid);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "getRoles");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);
        int size = role.getHeroCount();
        for (int i = 0; i < size; i++) {
            System.out.println("id:" + role.getId(i) + ",uid:" + role.getUid(i) + ",serverId:" + role.getServerId(i) +
                    ",roleId:" + role.getRoleId(i) + ",roleName:" + role.getRoleName(i) + ",roleType:" + role.getRoleType(i) +
                    ",A:" + role.getHero(i).getAttack() + ",D:" + role.getHero(i).getDefense() + ",L:" + role.getHero(i).getLife());
        }
    }

    public void getHero(int id) throws InvalidProtocolBufferException {
        builder.clear();

        builder.addId(id);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "getHero");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);

        if (role.getHeroCount() <= 0) {
            System.out.println("失败，详情请看日志");
            return;
        }
        System.out.println("A:" + role.getHero(0).getAttack());
        System.out.println("D:" + role.getHero(0).getDefense());
        System.out.println("L:" + role.getHero(0).getLife());
    }


    public void updateHero(int id, long a, long d, long l) throws InvalidProtocolBufferException {
        builder.clear();

        builder.addId(id);

        HeroProto.Hero.Builder builder1 = HeroProto.Hero.newBuilder();
        builder1.setAttack(a);
        builder1.setDefense(d);
        builder1.setLife(l);

        builder.addHero(builder1.build());

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "updateHero");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);

        System.out.println("Message:" + role.getMessage());
    }

    public void updateRoleName(int id, String roleName) throws InvalidProtocolBufferException {
        builder.clear();

        builder.addId(id);


        builder.addRoleName(roleName);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "updateRoleName");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);

        System.out.println("Message:" + role.getMessage());
    }

    public void updateRoleType(int id, String roleType) throws InvalidProtocolBufferException {
        builder.clear();

        builder.addId(id);


        builder.addRoleType(roleType);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "updateRoleType");

        HeroProto.Role role = HeroProto.Role.parseFrom(result);

        System.out.println("Message:" + role.getMessage());
    }

    private byte[] sendHttp(byte[] data, String controller) {
        OutputStream out = null;
        InputStream in = null;
        byte[] temp = new byte[1024];
        int len = 0;
        ByteArrayOutputStream result = new ByteArrayOutputStream();

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
            in = connection.getInputStream();

            int numBytes = -1;


            while (in.available() > 0) {
                numBytes = in.read(temp);
                if (numBytes >= 0) {
                    result.write(temp, 0, numBytes);
                    temp = new byte[1024];
                }
                len += numBytes;
            }


            //len = in.read(temp);

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
        byte[] result1 = new byte[len];
        System.arraycopy(result.toByteArray(), 0, result1, 0, len);
        return result1;
    }
}
