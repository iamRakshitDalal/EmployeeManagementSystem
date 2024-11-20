public class Query {
    static String create = "insert into employee(id,name,email,salary) values(?,?,?,?)";
    static String read ="select * from employee";
    static String updateName ="update employee set name = ? where id = ?";
    static String updateEmail ="update employee set email = ? where id = ?";
    static String updateSalary ="update employee set salary = ? where id = ?";
    static String delete = "delete from employee where id = ?";
}