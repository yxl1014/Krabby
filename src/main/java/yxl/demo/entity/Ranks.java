package yxl.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ranks {
    private List<Player> first;
    private List<Player> pre;
    private Player self;
    private List<Player> after;
}
