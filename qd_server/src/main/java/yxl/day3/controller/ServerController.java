package yxl.day3.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yxl.day3.service.ServerService;

@RestController
public class ServerController {

    @Autowired
    private ServerService serverService;

    @PostMapping("/addServer")
    @ResponseBody
    public String addServer(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        return serverService.insertServer("data") ? "ok" : "error";
    }

    @PostMapping("/findIdByServerName")
    @ResponseBody
    public String findIdByServerName(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        return serverService.findIdByServerName("data").toString();
    }
}
