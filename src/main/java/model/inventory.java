package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class inventory {


    private int inv_id;
    private String product_id;
    private String supplier_id;
    private int supply_qty;
    private double selling_price;
    private double buy_price;
    private int qtyOnHand;


}
