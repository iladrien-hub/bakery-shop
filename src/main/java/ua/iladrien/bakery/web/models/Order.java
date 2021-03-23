package ua.iladrien.bakery.web.models;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
public class Order {

    private Integer id;

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String shippingAddress;

    private BigDecimal total;

    @Singular
    private List<OrderProduct> products;
}
