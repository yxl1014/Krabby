package yxl.day3.entity;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterCard {
    private int id;
    private int uid;
    private int y;
    private int m;
    private int maps;
}
