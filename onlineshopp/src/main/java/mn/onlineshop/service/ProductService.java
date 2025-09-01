package mn.onlineshop.service;

import mn.onlineshop.model.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {

    List<Product> nereerHaih(String productName);

    List<Product> nereerHaih(String productName, int quantity);

    public List<Product> nereerHaih(int quantity);



}
