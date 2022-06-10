package yxl.day4.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Props {
    private int id;//id
    private String name;//道具名
    private int level;//等级
    private int ownership;//uid
    private int gold;//价值
    private boolean isPick;//是否被拾取
}
