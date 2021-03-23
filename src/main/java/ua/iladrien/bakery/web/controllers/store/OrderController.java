package ua.iladrien.bakery.web.controllers.store;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.services.store.IOrderService;

@RequiredArgsConstructor
public class OrderController {
    private final IOrderService orderService;
}
