package ua.iladrien.bakery.web.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Product {

    private Integer id;

    private BigDecimal price;

    private String name;
    private String description;

    @Builder.Default
    private List<String> pictures = new ArrayList<>();
    @Builder.Default
    private List<Category> categories = new ArrayList<>();
    @Builder.Default
    private List<Review> reviews = new ArrayList<>();

}
