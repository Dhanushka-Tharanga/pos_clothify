package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class products {
    private int product_id;
    private String size;
    private String  description;
    private String  category;
    private String product_name;

    private int supplier_id;

}
