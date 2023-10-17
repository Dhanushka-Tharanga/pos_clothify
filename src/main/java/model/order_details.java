package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class order_details {
    private int order_detail_id;
    private int order_id;
    private int product_id;
    private int  quantity;
    private double discount;
    private double  price_per_unit;


}
