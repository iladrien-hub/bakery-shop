package ua.iladrien.bakery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.iladrien.bakery.repositories.*;
import ua.iladrien.bakery.services.account.CustomerAccountService;
import ua.iladrien.bakery.services.account.IAccountService;
import ua.iladrien.bakery.services.store.*;
import ua.iladrien.bakery.web.controllers.AccountController;
import ua.iladrien.bakery.web.controllers.admin.CategoryAdminController;
import ua.iladrien.bakery.web.controllers.admin.OrderAdminController;
import ua.iladrien.bakery.web.controllers.admin.ProductAdminController;
import ua.iladrien.bakery.web.controllers.store.CategoryController;
import ua.iladrien.bakery.web.controllers.store.OrderController;
import ua.iladrien.bakery.web.controllers.store.ProductController;

@Configuration
public class AppContext {

    @Bean
    public ICategoryRepository categoryRepository() {
        return new CategoryRepository();
    }

    @Bean
    public IOrderRepository orderRepository() {
        return new OrderRepository();
    }

    @Bean
    public IProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    public IUserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public IAccountService accountService() {
        return new CustomerAccountService(userRepository());
    }

    @Bean
    public ICategoryService categoryService() {
        return new CategoryService(categoryRepository());
    }

    @Bean
    public IOrderService orderService() {
        return new OrderService(orderRepository());
    }

    @Bean
    public IProductService productService() {
        return new ProductService(productRepository());
    }

    @Bean
    public IReviewService reviewService() {
        return new ReviewService();
    }

    @Bean
    public CategoryAdminController categoryAdminController() {
        return new CategoryAdminController(categoryService());
    }

    @Bean
    public OrderAdminController orderAdminController() {
        return new OrderAdminController(orderService());
    }

    @Bean
    public ProductAdminController productAdminController() {
        return new ProductAdminController(productService());
    }

    @Bean
    public CategoryController categoryController() {
        return new CategoryController(categoryService());
    }

    @Bean
    public OrderController orderController() {
        return new OrderController(orderService());
    }

    @Bean
    public ProductController productController() {
        return new ProductController(productService());
    }

    @Bean
    public AccountController accountController() {
        return new AccountController(accountService());
    }
}
