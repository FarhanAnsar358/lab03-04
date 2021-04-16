package db;
import java.sql.*;

public class DbConnection {

    private String dbURL ="jdbc:mysql://localhost:3306/servletdb";
    private String username = "root";
    private String password= "";
    private Connection connection;
    public DbConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,username,password);
            if(connection != null)
            {
                System.out.println("Success");
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }




}
