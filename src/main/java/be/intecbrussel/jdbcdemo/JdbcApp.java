package be.intecbrussel.jdbcdemo;

import java.io.IOException;
import java.sql.*;

public class JdbcApp {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
       String connectionString = "jdbc:mysql://localhost:3306/beersdb";
        String username = "root";
        String password = "root";


    try (Connection connection = DriverManager.getConnection(connectionString, username, password)) {
        // ask for a statement
        Statement statement = connection.createStatement();
        //use this statement to execute a query
        ResultSet resultSet = statement.executeQuery("select  * from beers");
        //print all names from our result of the query
        while (resultSet.next()){
            System.out.println(resultSet.getString("Name"));
        }
        // do database things
    } catch (SQLException exception) {
        exception.printStackTrace();
    }



    }

}
