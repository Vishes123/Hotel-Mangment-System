package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con_database {
    Connection connection;
    public Statement statement;
    public Con_database(){
        try{

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms","root",  "Vishesh@123");
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
