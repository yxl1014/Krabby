package yxl.day4;

import com.google.protobuf.InvalidProtocolBufferException;
import yxl.day4.server.PropsServer;

public class Client {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        PropsServer server = new PropsServer();
        server.clear();
        //server.obtain(1);
    }
}
