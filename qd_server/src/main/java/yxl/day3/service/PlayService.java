package yxl.day3.service;

import com.google.protobuf.InvalidProtocolBufferException;

public interface PlayService {

    String register(byte[] data) throws InvalidProtocolBufferException;
}
