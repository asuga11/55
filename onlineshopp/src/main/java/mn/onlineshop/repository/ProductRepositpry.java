package mn.onlineshop.repository;

import mn.onlineshop.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepositpry extends JpaRepository<Product, Long> {

    static List<Product> findAllByName() {
        return null;
    }

    static List<Product> findAllByName(String name) {
        return null;
    }

    Optional<Product> findByProductName(String productName);
}
