package ua.iladrien.bakery.repositories;

import ua.iladrien.bakery.web.models.Category;
import ua.iladrien.bakery.web.models.Product;

import java.util.List;

public class CategoryRepository implements ICategoryRepository {

    @Override
    public Category save(Category category) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Category> getChildren(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Product> getProducts(Integer id) {
        throw new UnsupportedOperationException();
    }
}
