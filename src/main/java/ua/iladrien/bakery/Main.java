package ua.iladrien.bakery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.iladrien.bakery.web.controllers.AccountController;
import ua.iladrien.bakery.web.models.Category;
import ua.iladrien.bakery.web.models.Order;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);

        final AccountController accountController = context.getBean(AccountController.class);

        accountController.login("user", "pass");
//        Order o = new Order(1, "name", "lastname", "email", "phone", "asddress", BigDecimal.ZERO);
    }
}
