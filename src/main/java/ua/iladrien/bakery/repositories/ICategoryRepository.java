package ua.iladrien.bakery.repositories;

import ua.iladrien.bakery.web.models.Category;
import ua.iladrien.bakery.web.models.Product;

import java.util.List;

public interface ICategoryRepository {
    Category save(Category category);
    List<Category> getChildren(Integer id);
    List<Product> getProducts(Integer id);
}
