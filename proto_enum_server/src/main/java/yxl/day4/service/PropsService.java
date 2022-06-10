package yxl.day4.service;

public interface PropsService {
    byte[] clear();

    byte[] pick(int id, int uid);

    byte[] pthrow(int id, int uid);

    byte[] destroy(int id, int uid);

    byte[] give(int id, int uid, int guid);

    byte[] obtain(int uid);
}
