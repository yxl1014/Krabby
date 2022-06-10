package yxl.day3.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerCard {
    private int id;
    private String uname;
    private String upwd;
    private int serverId;
}
