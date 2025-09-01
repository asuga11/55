package mn.onlineshop.controller;


import mn.onlineshop.model.entity.Category;
import mn.onlineshop.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    CategoryService categoryService;
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("/api/categories")
    public List<Category> getAllCategories() {
       return this.categoryService.findAll();

    }

    @PostMapping("/api/category")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }
}
