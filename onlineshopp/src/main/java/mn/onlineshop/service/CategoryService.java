package mn.onlineshop.service;

import mn.onlineshop.model.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();
    List<Category> findByCategoryName(String CategoryName);


    public Category findByCategoryId(Long categoryId);
    public Category createCategory(Category category);
    Category updateCategory(Category category);
    public String deleteCategoryById(Long categoryId);
}
