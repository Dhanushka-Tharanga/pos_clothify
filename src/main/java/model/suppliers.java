package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class suppliers {
    private int  supplier_id;
    private String name;
    private String contact;
    private String email;
    private String company;
    private String title;

}
