package ua.iladrien.bakery.services.account;

import ua.iladrien.bakery.web.models.User;

public interface IAccountService {
    User register(String login, String password);
    User login(String login, String password);
    User save(User usr);
}
