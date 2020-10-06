package be.intecbrussel.jdbcdemo.apps;

import be.intecbrussel.jdbcdemo.data.BeerDao;
import be.intecbrussel.jdbcdemo.data.BeerDaoJdbcImpl;
import be.intecbrussel.jdbcdemo.data.BeerDaoListImpl;
import be.intecbrussel.jdbcdemo.model.Beer;

import java.util.ArrayList;
import java.util.List;

public class JavaBeersCafeApp {



    public static void main(String[] args){

        //instantiate a beer
        //Beer beer = new Beer("primero supremo", 11.1,15,72);
        //create a beerDao
        BeerDao beerDao = new BeerDaoJdbcImpl();

        //create a beer on the database
        //beerDao.createBeer(beer);

        //read a beer from the database
        //print out the beer
        //System.out.println(beerDao.readBeer("Very Diest"));

        //get beer from db
        //Beer beerWeWillUpdate = beerDao.readBeer(1440);
        //print it out
        //System.out.println(beerWeWillUpdate);
        //change stock value for beer
        //beerWeWillUpdate.setStock(beerWeWillUpdate.getStock()-1);
        //change alcohol value
        //beerWeWillUpdate.setAlcoholPercentage(10);
        //update beer in db
        //beerDao.updateBeer(beerWeWillUpdate);
        //get beer from db
        //beerWeWillUpdate = beerDao.readBeer(1440);
        //print it out
        //System.out.println(beerWeWillUpdate);

        //find beer that you would like to delete
        //Beer beerWeWillDelete = beerDao.readBeer(1559);
        //delete beer with given id
        //beerDao.deleteBeer(beerWeWillDelete);

        System.out.println("printing all beers: ");
        beerDao.readAllBeers().stream().forEach(System.out::println);
    }


}
