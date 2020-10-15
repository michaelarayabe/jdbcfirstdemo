package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.model.Categories;

public interface CategoryDaoJpa {

    void createCategory(Categories category);
    void findCategory(String category_name);
    void updateCategory(int id);
}
