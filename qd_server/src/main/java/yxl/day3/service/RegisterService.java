package yxl.day3.service;

import com.google.protobuf.InvalidProtocolBufferException;


public interface RegisterService {
    String register(byte[] data) throws InvalidProtocolBufferException;
}
