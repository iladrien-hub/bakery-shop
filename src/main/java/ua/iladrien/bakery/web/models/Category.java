package ua.iladrien.bakery.web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Category {

    private Integer id;
    private Integer parent;

    private String name;
    private String description;
    private String picture;

}
