package ua.iladrien.bakery.web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Review {

    private Integer id;

    private int userId;
    private String text;
    private int mark;

}
