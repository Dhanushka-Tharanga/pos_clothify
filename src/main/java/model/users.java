package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
public class users {
    private int  user_id;
    private String email;
    private String  password;
    private String user_type;
    private String user_name;

}
