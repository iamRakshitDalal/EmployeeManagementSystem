import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {
    public static void createData(Employee employee) throws SQLException{
        Connection conn = DB.connect();
        String query = Query.create;
        PreparedStatement preState = conn.prepareStatement(query);
        preState.setInt(1, employee.getId());
        preState.setString(2,employee.getName());
        preState.setString(3,employee.getEmail());
        preState.setInt(4,employee.getSalary());
        preState.executeUpdate();
        preState.close();
        conn.close();
    }   
    public static ArrayList<Employee> readData() throws SQLException{
        ArrayList<Employee> employees = new ArrayList<>();
        Connection conn = DB.connect();
        String query = Query.read;
        Statement state = conn.createStatement();
        ResultSet rs = state.executeQuery(query);
        while(rs.next()){
            employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getInt(4)));
        }
        state.close();
        conn.close();
        return employees;
    }
    public static void updateName(int id,String name) throws SQLException{
        Connection conn = DB.connect();
        String query = Query.updateName;
        PreparedStatement preState = conn.prepareStatement(query);
        preState.setInt(2, id);
        preState.setString(1,name);
        
        preState.executeUpdate();
        preState.close();
        conn.close();
    }
    public static void updateEmail(int id,String email) throws SQLException{
        Connection conn = DB.connect();
        String query = Query.updateEmail;
        PreparedStatement preState = conn.prepareStatement(query);
        preState.setInt(2, id);
        preState.setString(1,email);
        preState.executeUpdate();
        preState.close();
        conn.close();
    }
    public static void updateSalary(int id,int salary) throws SQLException{
        Connection conn = DB.connect();
        String query = Query.updateSalary;
        PreparedStatement preState = conn.prepareStatement(query);
        preState.setInt(2, id);
        preState.setInt(1,salary);
        preState.executeUpdate();
        preState.close();
        conn.close();
    }
    public static void deleteteData(int id) throws SQLException{
        Connection conn = DB.connect();
        String query = Query.delete;
        PreparedStatement preState = conn.prepareStatement(query);
        preState.setInt(1, id);
        preState.executeUpdate();
        preState.close();
        conn.close();
    }
}