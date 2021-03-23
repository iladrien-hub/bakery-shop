package ua.iladrien.bakery.services.store;

import ua.iladrien.bakery.web.models.Order;
import ua.iladrien.bakery.web.models.OrderProduct;

public interface IOrderService {
    Order save(Order obj);
    Order findById(int id);
    boolean removeById(int id);
    Order addProduct(OrderProduct product);
}
