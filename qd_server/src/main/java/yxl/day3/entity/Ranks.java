package yxl.day3.entity;

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
    private List<RankingCard> first;
    private List<RankingCard> pre;
    private RankingCard self;
    private List<RankingCard> after;
}
