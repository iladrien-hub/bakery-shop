package ua.iladrien.bakery.services.account;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.repositories.IUserRepository;
import ua.iladrien.bakery.web.models.User;

@RequiredArgsConstructor
public class CustomerAccountService implements IAccountService {

    private final IUserRepository userRepository;

    @Override
    public User register(String login, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User login(String login, String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public User save(User usr) {
        throw new UnsupportedOperationException();
    }
}
