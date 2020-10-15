package be.intecbrussel.jdbcdemo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Category;


    public Categories() {
    }

    public Categories(String category) {
        Category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", Category='" + Category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categories that = (Categories) o;
        return id == that.id &&
                Objects.equals(Category, that.Category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Category);
    }
}
