package ua.iladrien.bakery.services.store;

import ua.iladrien.bakery.web.models.Category;

public interface ICategoryService {
    Category save(Category category);
    Category findById(int id);
    boolean removeById(int id);
}
