package be.intecbrussel.jdbcdemo.apps;

import be.intecbrussel.jdbcdemo.data.util.EntityManagerFactoryProvider;
import be.intecbrussel.jdbcdemo.model.Beers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Scanner;

public class JpaSandboxApp {

    public static void main(String[] args) {
        EntityManagerFactory emf = EntityManagerFactoryProvider.getInstance().getEmf();

        EntityManager entityManager = null;

        try{

            entityManager = emf.createEntityManager();
            int id = 100115;
            //Beers beer = new Beers("sandbeer",0,1,1000);
            Beers beers = entityManager.find(Beers.class,id);


            EntityTransaction entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            beers.setBeerName("Sandbeer4");
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
