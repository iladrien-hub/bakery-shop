package ua.iladrien.bakery.web.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class User {

    private Integer id;

    private String username;
    private String passwordHash;

    private int permissionsLevel;
}
