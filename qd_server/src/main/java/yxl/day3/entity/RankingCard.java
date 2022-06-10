package yxl.day3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RankingCard implements Comparable<RankingCard> {
    private int id;

    private int uid;
    private int serverId;
    private int rank;

    @Override
    public int compareTo(RankingCard o) {
        if (this.serverId > o.serverId)
            return 1;
        else if (this.serverId == o.serverId) {
            return Integer.compare(this.rank, o.rank);
        } else
            return -1;
    }
}
