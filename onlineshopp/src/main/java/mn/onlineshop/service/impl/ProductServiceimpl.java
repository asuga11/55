package mn.onlineshop.service.impl;

import mn.onlineshop.model.entity.Product;
import mn.onlineshop.repository.ProductRepositpry;
import mn.onlineshop.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceimpl implements ProductService {
    private final ProductRepositpry productRepositpry;

    public ProductServiceimpl(ProductRepositpry productRepositpry) {
        this.productRepositpry = productRepositpry;
    }

    @Override
    public List<Product> nereerHaih(String productName) {

        return ProductRepositpry.findAllByName();
    }

    @Override
    public List<Product> nereerHaih(String productName, int quantity) {
        return List.of();
    }

    @Override
    public List<Product> nereerHaih(int quantity) {
        return List.of();
    }
}
