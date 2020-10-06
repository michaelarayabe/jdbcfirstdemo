package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.model.Beer;

import java.util.List;

public interface BeerDao {

    void createBeer(Beer beer);
    Beer readBeer(int beerId);
    Beer readBeer(String beerName);
    void updateBeer(Beer beer);
    void deleteBeer(Beer beer);

    List<Beer> readAllBeers();
    List<Beer> readAllBeersHavingAlcoholLowerThan(double maxAlcohol);
    List<Beer> readAllBeersHavingStockHigherThan(int minimumStock);
}
