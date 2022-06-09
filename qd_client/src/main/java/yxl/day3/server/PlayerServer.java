package yxl.day3.server;

import yxl.day3.dto.RegisterProto;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PlayerServer {

    private final RegisterProto.register.Builder registerBuilder = RegisterProto.register.newBuilder();

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    private final String url = "http://localhost:14253/register";

    public void register(int uid, String time) throws ParseException {
        registerBuilder.setUid(uid);
        registerBuilder.setTime(sdf.parse(time).getTime());

        RegisterProto.register register = registerBuilder.build();
        System.out.println(register);

        byte[] registerbyte = register.toByteArray();
        String result = sendHttp(registerbyte);
        System.out.println(result);
    }

    public void register(int uid){
        registerBuilder.setUid(uid);
        registerBuilder.setTime(System.currentTimeMillis());

        RegisterProto.register register = registerBuilder.build();
        System.out.println(register);

        byte[] registerbyte = register.toByteArray();
        String result = sendHttp(registerbyte);
        System.out.println(result);
    }


    private String sendHttp(byte[] data) {
        OutputStream out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL realUrl = new URL(url);
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
