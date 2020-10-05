package be.intecbrussel.jdbcdemo.apps;

import be.intecbrussel.jdbcdemo.data.BeerDao;
import be.intecbrussel.jdbcdemo.data.BeerDaoJdbcImpl;
import be.intecbrussel.jdbcdemo.data.BeerDaoListImpl;
import be.intecbrussel.jdbcdemo.model.Beer;

import java.util.ArrayList;
import java.util.List;

public class JavaBeersCafeApp {



    public static void main(String[] args){

        Beer beer = new Beer("primero supremo", 11.1,15,72);

        BeerDao beerDao = new BeerDaoJdbcImpl();

        beerDao.createBeer(beer);
        System.out.println(beerDao.readBeer("primero supremo"));

    }


}
