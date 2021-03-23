package ua.iladrien.bakery.web.controllers.store;

import lombok.RequiredArgsConstructor;
import ua.iladrien.bakery.services.store.IProductService;

@RequiredArgsConstructor
public class ProductController {
    private final IProductService productService;
}
