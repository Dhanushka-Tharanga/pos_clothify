package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class orders {
    private int order_id;
    private String order_date;
    private String employee_id;
    private int customer_id;
    private double total_discount;
    private double total_cost;
    private String payment_type;

}
