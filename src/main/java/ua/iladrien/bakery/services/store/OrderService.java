package ua.iladrien.bakery.services.store;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.repositories.IOrderRepository;
import ua.iladrien.bakery.web.models.Order;
import ua.iladrien.bakery.web.models.OrderProduct;

@RequiredArgsConstructor
public class OrderService implements IOrderService {

    private final IOrderRepository orderRepository;

    @Override
    public Order save(Order obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Order findById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Order addProduct(OrderProduct product) {
        throw new UnsupportedOperationException();
    }
}
