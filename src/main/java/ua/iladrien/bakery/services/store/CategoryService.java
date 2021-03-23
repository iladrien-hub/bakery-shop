package ua.iladrien.bakery.services.store;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.repositories.ICategoryRepository;
import ua.iladrien.bakery.web.models.Category;

@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final ICategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Category findById(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeById(int id) {
        throw new UnsupportedOperationException();
    }
}
