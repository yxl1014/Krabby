package yxl.day3.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yxl.day3.dto.ServerProto;
import yxl.day3.service.ServerService;

@RestController
public class ServerController {

    @Autowired
    private ServerService serverService;

    @PostMapping("/addServer")
    @ResponseBody
    public String addServer(@RequestBody byte[] data) throws InvalidProtocolBufferException {//String serverName
        ServerProto.server server = ServerProto.server.parseFrom(data);
        if (server == null)
            return "error";

        return serverService.insertServer(server.getServerName()) ? "ok" : "error";
    }

    @PostMapping("/findIdByServerName")
    @ResponseBody
    public String findIdByServerName(@RequestBody byte[] data) throws InvalidProtocolBufferException {//String serverName
        ServerProto.server server = ServerProto.server.parseFrom(data);
        if (server == null)
            return "error";
        Integer i = serverService.findIdByServerName(server.getServerName());
        return i != null ? i.toString() : "error";
    }
}
