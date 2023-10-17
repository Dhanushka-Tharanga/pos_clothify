package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class inventory_transactions {
   private int  transaction_id;
   private int  quantity;
   private String transaction_date;
   private String transaction_type;
   private String  order_id;
   private String product_id;

}
