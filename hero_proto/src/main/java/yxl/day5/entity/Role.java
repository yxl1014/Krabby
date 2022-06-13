package yxl.day5.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
    private int id;
    private int uid;
    private int serverId;
    private int roleId;
    private String roleName;
    private String roleType;
    private byte[] hero;

    private int heroLen;

    public Role(int uid, int serverId, int roleId, String roleName, String roleType, byte[] hero, int heroLen) {
        this.uid = uid;
        this.serverId = serverId;
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleType = roleType;
        this.hero = hero;
        this.heroLen = heroLen;
    }
}
