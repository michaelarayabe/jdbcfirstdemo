package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.model.Beer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
Is DEPRICATED
 */
public class BeerDaoListImpl implements BeerDao{
    private List<Beer> beerdb = new ArrayList<>();

    @Override
    public void createBeer(Beer beer) {
        beerdb.add(beer);
    }

    @Override
    public Beer readBeer(int beerId) {
        Beer beer = beerdb.get(beerId);
        return beer;
    }

    @Override
    public Beer readBeer(String beerName) {
        return  beerdb.stream()
                .filter(b->b.getBeerName().equals(beerName))
                .findFirst().get();
    }
/*
there once was a beer called bartbeer, it was not so very full of alcohol (1%)
then there was an update on the brewing proces, and the alcohol was overflowing(11%)
we updated the alcoholpercentage of bartbeer by updating the beer in the database
we gave as a parameter the new version of the beer
and the old one was overwritten
and so we end this tale
 */
    @Override
    public void updateBeer(Beer beer) {
        Beer beerToUpdate;
        //stream1 look for a beer in the beerdb with the same name as the given beer
        Optional<Beer> beerOptional = beerdb.stream()
                                            .filter(b->b.getBeerName().equals(beer.getBeerName()))
                                            .findFirst();
        /*
        alternative for stream1
        for (Beer b: beerdb){
            if(b.getBeerName().equals(beer.getBeerName())){
                beerToUpdate = b;
                break;
            }
        }*/

        //update the database beer
        if (beerOptional.isPresent()) {
            beerToUpdate = beerOptional.get();
            beerToUpdate.setAlcoholPercentage(beer.getAlcoholPercentage());
            beerToUpdate.setPrice(beer.getPrice());
            beerToUpdate.setStock(beer.getStock());

        }
    }

    @Override
    public void deleteBeer(Beer beer) {
        beerdb.remove(beer);
    }

    @Override
    public List<Beer> readAllBeers() {
        return beerdb;
    }

    @Override
    public List<Beer> readAllBeersHavingAlcoholLowerThan(double maxAlcohol) {
        return null;
    }

    @Override
    public List<Beer> readAllBeersHavingStockHigherThan(int minimumStock) {
        return null;
    }
}
