package yxl.day4.server;

import com.google.protobuf.InvalidProtocolBufferException;
import yxl.day4.dto.ProtoclProto;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;

public class PropsServer {
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    private final ProtoclProto.protocl.Builder builder = ProtoclProto.protocl.newBuilder();

    private final String url = "http://localhost:14725/";


    public void obtain(int uid) throws InvalidProtocolBufferException {
        builder.clear();
        builder.setType(ProtoclProto.ProtoclType.C2S_Obtain);
        builder.setUid(uid);

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "obtain");

        ProtoclProto.protocl protocl = ProtoclProto.protocl.parseFrom(result);
        if (protocl.getType() != ProtoclProto.ProtoclType.S2C_Obtain)
            System.out.println("获取失败");
        System.out.println(protocl.getProJson());
    }


    private byte[] sendHttp(byte[] data, String controller) {
        OutputStream out = null;
        InputStream in = null;
        byte[] result = new byte[1024];
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


            in.read(result);

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

        return result;
    }


    public void clear() throws InvalidProtocolBufferException {
        builder.clear();

        byte[] date = builder.build().toByteArray();
        byte[] result = sendHttp(date, "clear");

        ProtoclProto.protocl protocl = ProtoclProto.protocl.parseFrom(result);
        System.out.println(protocl.getStatus());
    }
}
