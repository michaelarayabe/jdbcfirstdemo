package be.intecbrussel.jdbcdemo.data;

import be.intecbrussel.jdbcdemo.model.Brewers;

public interface BrewerDao {

    void createBrewer(Brewers brewer);
    Brewers readBrewer(int berewerId);
    Brewers readBrewer(String berewerName);
    void updateBrewer(int berwerId);
}
