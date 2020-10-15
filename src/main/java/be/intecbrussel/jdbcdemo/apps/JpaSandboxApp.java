package be.intecbrussel.jdbcdemo.apps;

import be.intecbrussel.jdbcdemo.data.util.EntityManagerFactoryProvider;
import be.intecbrussel.jdbcdemo.model.Beers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


public class JpaSandboxApp {

    public static void main(String[] args) {
        EntityManagerFactory emf = EntityManagerFactoryProvider.getInstance().getEmf();

        EntityManager entityManager = null;

        try{

            entityManager = emf.createEntityManager();
            int id = 100115;
            //Beers beer = new Beers("sandbeer",0,1,1000);
            Beers beers = entityManager.find(Beers.class,id); //The old beer
            EntityTransaction entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();

            beers.setBeerName("Sandbeer6");

            entityManager.detach(beers); // not in the persistence context anymore

            Beers newBeers = entityManager.merge(beers); // the new beer is getting new info over the old beer
            //the first beers is the new beer
            //same as Beers newBeer = entityManager.merge(beers)


            newBeers.setBeerName("Am I attached really?");

            //Flush data to db
            entityTransaction.commit();



        }catch (Exception e){
            e.printStackTrace();

        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }

    }
}
