package yxl.day3.service.Impl;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.day3.dto.RegisterProto;
import yxl.day3.entity.RegisterCard;
import yxl.day3.mapper.RegisterMapper;
import yxl.day3.service.RegisterService;

import java.util.Calendar;
import java.util.Date;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public String register(byte[] data) throws InvalidProtocolBufferException {

        RegisterProto.register register = RegisterProto.register.parseFrom(data);

        Calendar time = Calendar.getInstance();
        time.setTime(new Date(register.getTime()));

        int year = time.get(Calendar.YEAR);
        int month = time.get(Calendar.MONTH) + 1;
        int day = time.get(Calendar.DATE);

        RegisterCard card = registerMapper.findRegisterCardByUidAndYAndM(register.getUid(), year, month);
        if (card == null) {
            int map = 0;
            map = setMap(day, map);
            registerMapper.insertRegister(register.getUid(), year, month, map);

            RegisterCard c = registerMapper.findRegisterCardByUidAndYAndM(register.getUid(), year, month);
            return year + "年" + month + "月，签到：" + getRegisters(c.getMaps()) + "天";
        }

        int map = card.getMaps();
        if (isRegister(day, map))
            return "您已签到";
        map = setMap(day, map);

        registerMapper.updateMapsByUidAndYAndM(map, register.getUid(), year, month);

        RegisterCard c = registerMapper.findRegisterCardById(card.getId());
        return year + "年" + month + "月，签到：" + getRegisters(c.getMaps()) + "天";
    }

    private int setMap(int day, int map) {
        return map | (1 << day);
    }

    private boolean isRegister(int day, int map) {
        int t = (map >> day) & 0x00000001;
        return t == 1;
    }

    private int getRegisters(int map) {
        int r = 0;
        for (int i = 1; i < 32; i++) {
            if (isRegister(i, map))
                r++;
        }
        return r;
    }
}
