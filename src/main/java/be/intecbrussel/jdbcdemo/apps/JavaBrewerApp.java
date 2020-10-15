package be.intecbrussel.jdbcdemo.apps;

import be.intecbrussel.jdbcdemo.data.BrewerDao;
import be.intecbrussel.jdbcdemo.data.BrewerDaoJpaImpl;
import be.intecbrussel.jdbcdemo.model.Brewers;

public class JavaBrewerApp {

    public static void main(String[] args) {
        Brewers brewers = new Brewers("oneBrewer","Kazablanka 11","200192","Addis Ababa",212);

          BrewerDao brewerDao = new BrewerDaoJpaImpl();
//         brewerDao.createBrewer(brewers);

        System.out.println(brewerDao.readBrewer(1));



    }
}
