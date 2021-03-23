package ua.iladrien.bakery.services.store;

import ua.iladrien.bakery.web.models.Product;

public interface IProductService {
    Product save(Product product);
    Product findById(int id);
    boolean removeById(int id);

}
