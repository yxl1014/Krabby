package yxl.day3.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import yxl.day3.dto.RankProto;
import yxl.day3.entity.Ranks;
import yxl.day3.service.RankService;

@RestController
public class RankController {

    @Autowired
    private RankService rankService;

    @PostMapping("/getRanks")
    @ResponseBody
    public Ranks findRanks(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        RankProto.rank rank = RankProto.rank.parseFrom(data);
        if (rank == null)
            return null;

        return rankService.findRanksByUidAndServerId(rank.getUid(), rank.getServerId());
    }

    @PostMapping("/fight")
    @ResponseBody
    public String fight(@RequestBody byte[] data) throws InvalidProtocolBufferException {
        RankProto.rank rank = RankProto.rank.parseFrom(data);
        if (rank == null)
            return null;

        boolean b = rankService.changeRank(rank.getUid(), rank.getUid2());
        return b ? "ok" : "error";
    }

}
