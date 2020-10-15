package be.intecbrussel.jdbcdemo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Beers {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double alcohol;
    private double price;
    private int stock;

    public Beers() {
    }

    public Beers(String name, double alcohol, double price, int stock) {
        this.name = name;
        this.alcohol = alcohol;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeerName() {
        return name;
    }

    public void setBeerName(String beerName) {
        this.name = beerName;
    }

    public double getAlcoholPercentage() {
        return alcohol;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcohol = alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString(){
        return " Beer with: id:" +id +", Beername = " + name+", Alcoholprecentage = "+ alcohol
                + ", Price = " + price + ", Stock = " +stock;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beers beer = (Beers) o;
        return Double.compare(beer.alcohol, alcohol) == 0 &&
                Double.compare(beer.price, price) == 0 &&
                stock == beer.stock &&
                Objects.equals(name, beer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, alcohol, price, stock);
    }
}
