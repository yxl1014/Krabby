package yxl.day3.controller;


import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yxl.day3.dto.PlayerProto;
import yxl.day3.service.PlayerService;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        PlayerProto.player player = PlayerProto.player.parseFrom(data);
        if (player == null)
            return "error";

        int i = playerService.login(player.getUname(), player.getUpwd());
        return i != -1 ? String.valueOf(i) : "error";
    }

    @PostMapping("/logon")
    @ResponseBody
    public String logon(@RequestBody byte[] data){
        PlayerProto.player player;
        try {
            player = PlayerProto.player.parseFrom(data);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
        if (player == null)
            return "error";
        return playerService.logon(player.getUname(), player.getUpwd(), player.getServerId()) ? "ok" : "error";
    }
}
