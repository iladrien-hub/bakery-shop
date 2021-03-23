package ua.iladrien.bakery.repositories;

import ua.iladrien.bakery.web.models.Order;

public interface IOrderRepository {
    Order save(Order order);
}
