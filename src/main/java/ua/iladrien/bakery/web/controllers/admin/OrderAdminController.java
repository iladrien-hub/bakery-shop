package ua.iladrien.bakery.web.controllers.admin;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.services.store.IOrderService;

@RequiredArgsConstructor
public class OrderAdminController {
    private final IOrderService orderService;
}
