package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.model.Beers;

import java.util.List;

public interface BeerDao {

    void createBeer(Beers beer);
    Beers readBeer(int beerId);
    Beers readBeer(String beerName);
    void updateBeer(Beers beer);
    void updateBeer(int beerId);
    void updateBeer(String beerName);
    void deleteBeer(Beers beer);

    List<Beers> readAllBeers();
    List<Beers> readAllBeersHavingAlcoholLowerThan(double maxAlcohol);
    List<Beers> readAllBeersHavingStockHigherThan(int minimumStock);
}
