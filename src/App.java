import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Employee Management");
            System.out.println("1 = Create, 2 = Read, 3 = Update, 4 = Delete ");
            
            int choice = sc.nextInt();
            if(choice <1 || choice>4) break;
            switch (choice) {
                case 1:System.out.println("id ,name ,email ,salary");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name =sc.nextLine();
                    String email = sc.nextLine();
                    int salary = sc.nextInt();
                    EmployeeDao.createData(new Employee(id, name, email, salary));
                    System.out.println("Your Data is Created");
                    break;
                case 2:ArrayList<Employee> arr = EmployeeDao.readData();
                    for(Employee employee :arr){
                        System.out.println(employee);
                    }
                    break;
                case 3:System.out.println("1 = Update Name, 2 = Update Email, 3 = Update Salary");
                    int updateChoice = sc.nextInt(); 
                    switch (updateChoice) {
                        case 1:System.out.println("Id & Name");
                            id = sc.nextInt();
                            sc.nextLine();
                            name =sc.nextLine();
                            EmployeeDao.updateName(id, name);
                            System.out.println("Update Succesfully");
                            break;
                        case 2:System.out.println("Id & Email");
                            id = sc.nextInt();
                            sc.nextLine();
                            email =sc.nextLine();
                            EmployeeDao.updateEmail(id, email);
                            System.out.println("Update Succesfully");
                            break;
                        case 3:System.out.println("Id & Salary");
                            id = sc.nextInt();
                            sc.nextLine();
                            salary =sc.nextInt();
                            EmployeeDao.updateSalary(id, salary);
                            System.out.println("Update Succesfully");
                            break;
                    
                        default:
                            System.out.println("Wrong Choice");
                            break;
                    }
                    break;
                case 4:System.out.println("Id");
                    id = sc.nextInt();
                    EmployeeDao.deleteteData(id);
                    System.out.println("Delete Succesfully");
                    break;            
            }
            
        }
        sc.close();
    }
}
