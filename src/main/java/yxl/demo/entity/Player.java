package yxl.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player implements Comparable<Player> {
    private int id;
    private int serverId;
    private int rank;

    @Override
    public int compareTo(Player o) {
        if (this.serverId > o.serverId)
            return 1;
        else if (this.serverId == o.serverId) {
            return Integer.compare(this.rank, o.rank);
        } else
            return -1;
    }
}
