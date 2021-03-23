package ua.iladrien.bakery.repositories;

import ua.iladrien.bakery.web.models.User;

public interface IUserRepository {

    User findByUsername(String username);
    User findById(int id);
    User save(User user);

}
