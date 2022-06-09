package yxl.day3;

import yxl.day3.server.PlayerServer;

import java.text.ParseException;

public class Client {
    public static void main(String[] args) throws ParseException {
        PlayerServer server = new PlayerServer();
        server.register(1);
        server.register(1,"2022-6-12");
    }
}
