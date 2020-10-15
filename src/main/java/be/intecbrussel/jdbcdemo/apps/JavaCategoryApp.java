package be.intecbrussel.jdbcdemo.apps;

import be.intecbrussel.jdbcdemo.data.CategoryDaoJpa;
import be.intecbrussel.jdbcdemo.data.CategoryJpaImpl;
import be.intecbrussel.jdbcdemo.model.Categories;

public class JavaCategoryApp {

    public static void main(String[] args) {
        CategoryDaoJpa categoryDaoJpa = new CategoryJpaImpl();

        Categories category = new Categories();
//        category.setCategory("OneToThree");

//        categoryDaoJpa.createCategory(category);


        categoryDaoJpa.findCategory("Bitter");
    }
}
