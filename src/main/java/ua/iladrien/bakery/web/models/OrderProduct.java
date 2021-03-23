package ua.iladrien.bakery.web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Setter
@Getter
public class OrderProduct {
    private Integer id;
    private Integer orderId;

    private BigDecimal price;
    private int quantity;
    private int total;

}
