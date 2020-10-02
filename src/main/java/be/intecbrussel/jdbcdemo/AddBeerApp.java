package be.intecbrussel.jdbcdemo;

import java.sql.*;

public class AddBeerApp {

    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/beersdb";
        String username = "root";
        String password = "root";


        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
            // ask for a statement
            Statement statement = connection.createStatement();
            //use this statement to execute a query
            statement.execute("insert into beers(name,alcohol) value ('bartbeer',14)");
            // do database things
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
