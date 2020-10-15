package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.data.util.EntityManagerFactoryProvider;
import be.intecbrussel.jdbcdemo.model.Brewers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BrewerDaoJpaImpl implements BrewerDao{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("testtwo");



    @Override
    public void createBrewer(Brewers brewer) {
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(brewer);
        et.commit();
        System.out.println("Brewer is created!");
    }

    @Override
    public Brewers readBrewer(int berewerId) {
        EntityManager em = emf.createEntityManager();

        return em.find(Brewers.class,berewerId);

    }

    @Override
    public Brewers readBrewer(String berewerName) {
        return null;
    }

    @Override
    public void updateBrewer(int berwerId) {

        EntityManagerFactory emf = EntityManagerFactoryProvider.getInstance().getEmf();

        EntityManager em = emf.createEntityManager();

        Brewers brewers = em.find(Brewers.class,berwerId);

        EntityTransaction entityTransaction = em.getTransaction();

        entityTransaction.begin();

        brewers.setAddress("Leiekaai");
        brewers.setCity("Gent");
        brewers.setName("LocalName");
        brewers.setTurnover(10000);
        brewers.setZipcode("9000");

        entityTransaction.commit();
    }
}
