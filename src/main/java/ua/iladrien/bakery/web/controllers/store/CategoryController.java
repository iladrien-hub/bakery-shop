package ua.iladrien.bakery.web.controllers.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ua.iladrien.bakery.services.store.ICategoryService;

@RequiredArgsConstructor
public class CategoryController {
    private final ICategoryService categoryService;
}
