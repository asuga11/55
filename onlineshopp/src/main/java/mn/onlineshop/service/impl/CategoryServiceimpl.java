package mn.onlineshop.service.impl;

import mn.onlineshop.model.entity.Category;
import mn.onlineshop.repository.CategoryRepositpry;
import mn.onlineshop.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public abstract class CategoryServiceimpl  implements CategoryService {
    private  CategoryRepositpry categoryRepositpry;
    public CategoryServiceimpl(CategoryRepositpry categoryRepositpry) {
        this.categoryRepositpry = categoryRepositpry;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepositpry.findAll();
    }


    @Override
    public Category findByCategoryId(Long categoryId) {
        return categoryRepositpry.findById(categoryId).get();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepositpry.save(category);
    }


    @Override
    public Category updateCategory(Category category) {
        Category findCategory = categoryRepositpry.findById(category.getId()).orElse(null);
        findCategory.setName(category.getName());
        findCategory.getDescription();
        return categoryRepositpry.save(findCategory);
    }

    @Override
    public String deleteCategoryById(Long categoryId) {
        categoryRepositpry.deleteById(categoryId);
        return categoryId + " iim id ustaglaa";
    }

}
