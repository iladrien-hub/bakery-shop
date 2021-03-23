package ua.iladrien.bakery.web.controllers.admin;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.services.store.ICategoryService;

@RequiredArgsConstructor
public class CategoryAdminController {

    private final ICategoryService categoryService;

}
