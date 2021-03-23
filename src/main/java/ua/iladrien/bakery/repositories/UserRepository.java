package ua.iladrien.bakery.repositories;

import ua.iladrien.bakery.web.models.User;

public class UserRepository implements IUserRepository {
    @Override
    public User findByUsername(String username) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User save(User user) {
        throw new UnsupportedOperationException();
    }
}
