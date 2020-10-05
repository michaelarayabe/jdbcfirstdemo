package be.intecbrussel.jdbcdemo.apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteBeerApp {

    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/beersdb";
        String username = "root";
        String password = "root";


        try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
            // ask for a statement
            Statement statement = connection.createStatement();
            //use this statement to execute a query
            statement.execute("DELETE from beers where name like '%Bert%'");
            // do database things
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }


}
