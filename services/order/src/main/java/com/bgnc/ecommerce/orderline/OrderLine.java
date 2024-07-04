package com.bgnc.ecommerce.orderline;

import com.bgnc.ecommerce.order.Order;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class OrderLine {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order product;

    private Integer productId;
    private double quantity;

}
