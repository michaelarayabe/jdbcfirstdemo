package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.data.util.EntityManagerFactoryProvider;
import be.intecbrussel.jdbcdemo.model.Beers;

import javax.persistence.*;
import java.util.List;

public class BeerDaoJpaImpl implements BeerDao{

    //EntityManagerFactory emf = Persistence.createEntityManagerFactory("beerpersistenceunit");

    EntityManagerFactory emf = EntityManagerFactoryProvider.getInstance().getEmf();

    @Override
    public void createBeer(Beers beer) {

        EntityManager em = emf.createEntityManager();

        EntityTransaction entityTransaction = em.getTransaction();

        entityTransaction.begin();
        //em.merge(beer);
        em.persist(beer);
        entityTransaction.commit();


    }

    @Override
    public Beers readBeer(int beerId) {


        EntityManager em = emf.createEntityManager();
        return em.find(Beers.class,beerId);

    }

    @Override
    public Beers readBeer(String beerName) {


        EntityManager em = emf.createEntityManager();

        Beers beers = new Beers();
        beers.setBeerName(beerName);
        int id = beers.getId();

        return em.find(Beers.class,id);
    }

    @Override
    public void updateBeer(Beers beer) {

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        int beerID = beer.getId();
        Beers beers = entityManager.find(Beers.class,beerID);

        entityTransaction.begin();
        beers.setBeerName("anonBeer");
        beers.setPrice(300);
        beers.setAlcoholPercentage(300);
        beers.setStock(300);
        entityTransaction.commit();
    }

    @Override
    public void updateBeer(int beerId) {

        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();


        Beers beers = entityManager.find(Beers.class,beerId);

        entityTransaction.begin();

        beers.setBeerName("somesome");
        beers.setPrice(200);
        beers.setAlcoholPercentage(200);
        beers.setStock(200);

        entityTransaction.commit();
    }

    @Override
    public void deleteBeer(Beers beer) {

    }

    @Override
    public List<Beers> readAllBeers() {
        return null;
    }

    @Override
    public List<Beers> readAllBeersHavingAlcoholLowerThan(double maxAlcohol) {
        return null;
    }

    @Override
    public List<Beers> readAllBeersHavingStockHigherThan(int minimumStock) {
        return null;
    }
}
