package mn.onlineshop.controller;
import mn.onlineshop.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/product")
    public Class<? extends ProductService> getProducts() {
        return productService.getClass();
    }
}
