package yxl.day3.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yxl.day3.service.PlayService;

@RestController
public class PlayController {

    @Autowired
    private PlayService service;

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        return service.register(data);
    }
}
