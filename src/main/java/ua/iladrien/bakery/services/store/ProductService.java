package ua.iladrien.bakery.services.store;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.repositories.IProductRepository;
import ua.iladrien.bakery.web.models.Product;

@RequiredArgsConstructor
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

    @Override
    public Product save(Product product) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Product findById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException();
    }
}
