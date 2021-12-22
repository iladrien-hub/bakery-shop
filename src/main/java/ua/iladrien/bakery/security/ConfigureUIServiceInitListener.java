package ua.iladrien.bakery.security;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import org.springframework.stereotype.Component;
import ua.iladrien.bakery.ui.admin.list.CategoriesView;
import ua.iladrien.bakery.ui.admin.list.OrdersView;
import ua.iladrien.bakery.ui.admin.list.ProductsView;
import ua.iladrien.bakery.ui.login.LoginView;

import java.util.List;

@Component
public class ConfigureUIServiceInitListener implements VaadinServiceInitListener {

    private static final List<Class<?>> secured = List.of(
            CategoriesView.class,
            OrdersView.class,
            ProductsView.class
    );

    @Override
    public void serviceInit(ServiceInitEvent event) {
        event.getSource().addUIInitListener(uiEvent -> {
            final UI ui = uiEvent.getUI();
            ui.addBeforeEnterListener(this::authenticateNavigation);
        });
    }

    private void authenticateNavigation(BeforeEnterEvent event) {
        if (secured.contains(event.getNavigationTarget()) && !SecurityUtils.isUserLoggedIn()) {
            event.rerouteTo(LoginView.class);
        }
    }
}
