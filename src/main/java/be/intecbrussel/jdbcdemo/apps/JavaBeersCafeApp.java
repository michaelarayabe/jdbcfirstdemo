package be.intecbrussel.jdbcdemo.apps;

import be.intecbrussel.jdbcdemo.data.*;
import be.intecbrussel.jdbcdemo.model.Beers;

public class JavaBeersCafeApp {



    public static void main(String[] args){


       BeerDao beerDao = new BeerDaoJpaImpl();
       //Beers somebeer = new Beers("beerName",2.1,21,11);
       //beerDao.createBeer(somebeer);

        //System.out.println(beerDao.readBeer(16));

        //System.out.println(beerDao.readBeer("Adler"));

        //Update beer met ID
        beerDao.updateBeer(7);

        //Update beer met beer object
        Beers beers = new Beers();
        beers.setId(11);

        beerDao.updateBeer(beers);

        CategoryDaoJpa categoryDao = new CategoryJpaImpl();
        categoryDao.updateCategory(2);

        BrewerDao brewerDao = new BrewerDaoJpaImpl();

        brewerDao.updateBrewer(1);

        beerDao.updateBeer("Alken");

    }


}
