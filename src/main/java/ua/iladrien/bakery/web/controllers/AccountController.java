package ua.iladrien.bakery.web.controllers;


import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.services.account.IAccountService;

@RequiredArgsConstructor
public class AccountController {

    private final IAccountService customerService;

    public String login(String username, String password) {
        throw new UnsupportedOperationException();
    }
}
