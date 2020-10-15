package be.intecbrussel.jdbcdemo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Brewers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private int turnover;

    public Brewers() {
    }

    public Brewers(String name, String address, String zipcode, String city, int turnover) {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.turnover = turnover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    @Override
    public String toString() {
        return "Brewers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", turnover=" + turnover +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brewers brewers = (Brewers) o;
        return id == brewers.id &&
                turnover == brewers.turnover &&
                Objects.equals(name, brewers.name) &&
                Objects.equals(address, brewers.address) &&
                Objects.equals(zipcode, brewers.zipcode) &&
                Objects.equals(city, brewers.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, zipcode, city, turnover);
    }
}
