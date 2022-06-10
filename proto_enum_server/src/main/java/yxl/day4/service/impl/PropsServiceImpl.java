package yxl.day4.service.impl;

import com.google.gson.Gson;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yxl.day4.dto.ProtoclProto;
import yxl.day4.entity.Props;
import yxl.day4.mapper.PropsMapper;
import yxl.day4.service.PropsService;
import yxl.day4.tools.WeightRandom;

import java.util.ArrayList;
import java.util.List;

@Service
public class PropsServiceImpl implements PropsService {

    @Autowired
    private PropsMapper propsMapper;

    private final WeightRandom<String, Double> levelRandom = new WeightRandom<>();

    private final WeightRandom<Integer, Double> numRandom = new WeightRandom<>();

    private final WeightRandom<String, Double> nameRandom = new WeightRandom<>();

    @Override
    public byte[] clear() {
        propsMapper.clear();

        ProtoclProto.protocl.Builder builder = ProtoclProto.protocl.newBuilder();
        builder.setStatus(true);

        return builder.build().toByteArray();
    }

    @Override
    public byte[] pick(int id, int uid) {
        //TODO:uid is exist?
        //TODO:id is exist?
        ProtoclProto.protocl.Builder builder = ProtoclProto.protocl.newBuilder();
        Integer num = propsMapper.findCountByIdAndOwnership(id, 0);

        if (num <= 0) {
            builder.setStatus(false);
            builder.setProJson("物品已被获取或已被清除");
        } else {
            Integer ok = propsMapper.updateOwnershipById(uid, id);
            Integer ok1 = propsMapper.updateIsPickById(true, id);
            builder.setStatus(ok + ok1 >= 1);
        }
        builder.setType(ProtoclProto.ProtoclType.S2C_Pick);

        return builder.build().toByteArray();
    }

    @Override
    public byte[] pthrow(int id, int uid) {

        //TODO:uid is exist?
        //TODO:id is exist?
        ProtoclProto.protocl.Builder builder = ProtoclProto.protocl.newBuilder();
        Integer num = propsMapper.findCountByIdAndOwnership(id, uid);

        if (num == 0) {
            builder.setStatus(false);
            builder.setProJson("你没有该物品");
        } else {
            Integer ok = propsMapper.updateOwnershipById(0, id);
            Integer ok1 = propsMapper.updateIsPickById(false, id);
            builder.setStatus(ok + ok1 >= 1);
        }
        builder.setType(ProtoclProto.ProtoclType.S2C_Throw);

        return builder.build().toByteArray();
    }

    @Override
    public byte[] destroy(int id, int uid) {
        //TODO:uid is exist?
        //TODO:id is exist?
        ProtoclProto.protocl.Builder builder = ProtoclProto.protocl.newBuilder();

        Integer num = propsMapper.findCountByIdAndOwnership(id, uid);

        if (num == 0) {
            builder.setStatus(false);
            builder.setProJson("该物品不属于你");
        } else {
            Integer ok = propsMapper.deleteById(id);
            builder.setStatus(ok == 1);
        }
        builder.setType(ProtoclProto.ProtoclType.S2C_Destroy);

        return builder.build().toByteArray();
    }

    @Override
    public byte[] give(int id, int uid, int guid) {
        //TODO:uid is exist?
        //TODO:id is exist?
        //TODO:guid is exist?

        ProtoclProto.protocl.Builder builder = ProtoclProto.protocl.newBuilder();

        Integer num = propsMapper.findCountByIdAndOwnership(id, uid);

        if (num == 0) {
            builder.setStatus(false);
            builder.setProJson("该物品不属于你");
        } else {
            Integer ok = propsMapper.updateOwnershipById(guid, id);
            builder.setStatus(ok == 1);
        }
        builder.setType(ProtoclProto.ProtoclType.S2C_Give);

        return builder.build().toByteArray();
    }

    @Override
    public byte[] obtain(int uid) {
        //TODO:uid is exist?

        ProtoclProto.protocl.Builder builder = ProtoclProto.protocl.newBuilder();

        int num = getNumRandom();

        int i = 0;
        for (; i < num; i++) {
            Props p = propsBuilder(uid);
            propsMapper.insertProps(p.getName(), p.getLevel(), p.getOwnership(), p.getGold());
        }

        List<Props> props = propsMapper.findPropsByUidAndNoPick(uid);
        builder.setStatus(i == num);
        builder.setType(ProtoclProto.ProtoclType.S2C_Obtain);
        builder.setProJson(new Gson().toJson(props));

        return builder.build().toByteArray();
    }

    private Props propsBuilder(int uid) {
        Props props = new Props();
        props.setOwnership(uid);
        String level = getLevelRandom();
        props.setLevel(getLevelCode(level));
        String name = getNameRandom();
        props.setName(name);
        props.setGold(getGold(name, level));
        return props;
    }

    private String getLevelRandom() {
        if (this.levelRandom.getWeightMap().size() == 0) {
            List<Pair<String, Double>> list = new ArrayList<>();
            list.add(new Pair<>("橙", 0.05));
            list.add(new Pair<>("紫", 0.15));
            list.add(new Pair<>("蓝", 0.3));
            list.add(new Pair<>("白", 0.5));
            this.levelRandom.init(list);
        }
        return this.levelRandom.random();
    }

    private Integer getNumRandom() {
        if (this.numRandom.getWeightMap().size() == 0) {
            List<Pair<Integer, Double>> list = new ArrayList<>();
            list.add(new Pair<>(8, 0.05));
            list.add(new Pair<>(7, 0.15));
            list.add(new Pair<>(6, 0.3));
            list.add(new Pair<>(5, 0.5));
            this.numRandom.init(list);
        }
        return this.numRandom.random();
    }

    private String getNameRandom() {
        if (this.nameRandom.getWeightMap().size() == 0) {
            List<Pair<String, Double>> list = new ArrayList<>();
            list.add(new Pair<>("方天画戟", 0.05));
            list.add(new Pair<>("青龙堰月刀", 0.15));
            list.add(new Pair<>("雌雄双股剑", 0.3));
            list.add(new Pair<>("长八蛇矛", 0.5));
            this.nameRandom.init(list);
        }
        return this.nameRandom.random();
    }

    private int getLevelCode(String level) {
        switch (level) {
            case "橙":
                return 1;
            case "紫":
                return 2;
            case "蓝":
                return 3;
            case "白":
            default:
                return 4;
        }
    }

    private int getGold(String name, String level) {
        switch (level) {
            case "橙": {
                double i = 0.05;
                switch (name) {
                    case "方天画戟":
                        return (int) (10.0 / i / 0.05);
                    case "青龙堰月刀":
                        return (int) (10.0 / i / 0.15);
                    case "雌雄双股剑":
                        return (int) (10.0 / i / 0.3);
                    case "长八蛇矛":
                        return (int) (10.0 / i / 0.5);
                }
            }
            case "紫": {
                double i = 0.15;
                switch (name) {
                    case "方天画戟":
                        return (int) (10.0 / i / 0.05);
                    case "青龙堰月刀":
                        return (int) (10.0 / i / 0.15);
                    case "雌雄双股剑":
                        return (int) (10.0 / i / 0.3);
                    case "长八蛇矛":
                        return (int) (10.0 / i / 0.5);
                }
            }
            case "蓝": {
                double i = 0.3;
                switch (name) {
                    case "方天画戟":
                        return (int) (10.0 / i / 0.05);
                    case "青龙堰月刀":
                        return (int) (10.0 / i / 0.15);
                    case "雌雄双股剑":
                        return (int) (10.0 / i / 0.3);
                    case "长八蛇矛":
                        return (int) (10.0 / i / 0.5);
                }
            }
            case "白":
            default: {
                double i = 0.5;
                switch (name) {
                    case "方天画戟":
                        return (int) (10.0 / i / 0.05);
                    case "青龙堰月刀":
                        return (int) (10.0 / i / 0.15);
                    case "雌雄双股剑":
                        return (int) (10.0 / i / 0.3);
                    case "长八蛇矛":
                        return (int) (10.0 / i / 0.5);
                }
            }
        }
        return 0;
    }
}
