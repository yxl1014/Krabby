package yxl.day3.service;

public interface PlayerService {

    int login(String uname, String upwd);

    boolean logon(String uname, String upwd, int serverId);
}
