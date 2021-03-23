package ua.iladrien.bakery.repositories;

import ua.iladrien.bakery.web.models.Product;

public interface IProductRepository {
    Product save(Product product);
}
