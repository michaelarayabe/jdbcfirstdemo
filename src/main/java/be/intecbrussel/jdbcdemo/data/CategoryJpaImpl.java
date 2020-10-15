package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.data.util.EntityManagerFactoryProvider;
import be.intecbrussel.jdbcdemo.model.Categories;
import org.hibernate.sql.HSQLCaseFragment;

import javax.persistence.*;
import java.sql.PreparedStatement;
import java.util.List;

public class CategoryJpaImpl implements CategoryDaoJpa{

    @Override
    public void createCategory(Categories category) {

        Categories category1 = new Categories();
        category1.setCategory(category.getCategory());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testone");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        em.persist(category1);

        et.commit();
        System.out.println("Created!");


    }

    @Override
    public void findCategory(String category_name) {

        Categories categories = new Categories();
        categories.setCategory(category_name);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testone");
        EntityManager em = emf.createEntityManager();

       // String sql = "select categories from Categories categories where categories = 'category_name'";


        //TypedQuery<Categories> query = em.createQuery(sql, Categories.class);

       //query.getSingleResult();


 /*
        List<Categories> categories1 = query.getResultList();

        for(Categories c : categories1){

            if(c.getCategory().equals(category_name)) {
                System.out.println(c);
            }
        }

  */

    }

    @Override
    public void updateCategory(int id) {
        EntityManagerFactory emf = EntityManagerFactoryProvider.getInstance().getEmf();

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        Categories categories = em.find(Categories.class,id);
        et.begin();
        categories.setCategory("AlcoCategory");
        et.commit();

    }
}
