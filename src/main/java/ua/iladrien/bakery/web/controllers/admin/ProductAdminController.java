package ua.iladrien.bakery.web.controllers.admin;

import lombok.RequiredArgsConstructor;
import lombok.NonNull;
import ua.iladrien.bakery.services.store.IProductService;

@RequiredArgsConstructor
public class ProductAdminController {

    @NonNull
    private final IProductService productService;

}
