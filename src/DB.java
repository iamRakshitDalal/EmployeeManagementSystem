import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    
    public static  Connection connect(){
         
        String url = "jdbc:mysql://localhost:3306/bh";
        String name = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        return connection;
    }
}
