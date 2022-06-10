package yxl.day4.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yxl.day4.dto.ProtoclProto;
import yxl.day4.service.PropsService;

@RestController
public class PropsController {

    @Autowired
    private PropsService propsService;

    @PostMapping("clear")
    @ResponseBody
    public byte[] clear() {
        return propsService.clear();
    }

    @PostMapping("throw")
    @ResponseBody
    public byte[] pthrow(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        ProtoclProto.protocl protocl = ProtoclProto.protocl.parseFrom(data);

        if (protocl.getType() != ProtoclProto.ProtoclType.C2S_Throw) {
            return ProtoclProto.protocl.newBuilder()
                    .setStatus(false)
                    .setType(ProtoclProto.ProtoclType.S2C_Throw)
                    .setProJson("非法访问")
                    .build().toByteArray();

        }
        return propsService.pthrow(protocl.getId(), protocl.getUid());
    }


    @PostMapping("pick")
    @ResponseBody
    public byte[] pick(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        ProtoclProto.protocl protocl = ProtoclProto.protocl.parseFrom(data);

        if (protocl.getType() != ProtoclProto.ProtoclType.C2S_Pick) {
            return ProtoclProto.protocl.newBuilder()
                    .setStatus(false)
                    .setType(ProtoclProto.ProtoclType.S2C_Pick)
                    .setProJson("非法访问")
                    .build().toByteArray();

        }
        return propsService.pick(protocl.getId(), protocl.getUid());
    }

    @PostMapping("destroy")
    @ResponseBody
    public byte[] destroy(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        ProtoclProto.protocl protocl = ProtoclProto.protocl.parseFrom(data);

        if (protocl.getType() != ProtoclProto.ProtoclType.C2S_Destroy) {
            return ProtoclProto.protocl.newBuilder()
                    .setStatus(false)
                    .setType(ProtoclProto.ProtoclType.S2C_Destroy)
                    .setProJson("非法访问")
                    .build().toByteArray();

        }
        return propsService.destroy(protocl.getId(), protocl.getUid());
    }

    @PostMapping("give")
    @ResponseBody
    public byte[] give(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        ProtoclProto.protocl protocl = ProtoclProto.protocl.parseFrom(data);

        if (protocl.getType() != ProtoclProto.ProtoclType.C2S_Give) {
            return ProtoclProto.protocl.newBuilder()
                    .setStatus(false)
                    .setType(ProtoclProto.ProtoclType.S2C_Give)
                    .setProJson("非法访问")
                    .build().toByteArray();

        }
        return propsService.give(protocl.getId(), protocl.getUid(),protocl.getGuid());
    }

    @PostMapping("obtain")
    @ResponseBody
    public byte[] obtain(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        ProtoclProto.protocl protocl = ProtoclProto.protocl.parseFrom(data);

        if (protocl.getType() != ProtoclProto.ProtoclType.C2S_Obtain) {
            return ProtoclProto.protocl.newBuilder()
                    .setStatus(false)
                    .setType(ProtoclProto.ProtoclType.S2C_Obtain)
                    .setProJson("非法访问")
                    .build().toByteArray();

        }
        return propsService.obtain(protocl.getUid());
    }
}
