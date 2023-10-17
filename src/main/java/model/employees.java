package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class employees {
    private int employee_id;
    private String  first_name;
    private String last_name;
    private String address;
    private String email;
    private String bankAccNo;
    private String  bankBranch;
    private String NIC;
    private String dob;
    private String title;

}
