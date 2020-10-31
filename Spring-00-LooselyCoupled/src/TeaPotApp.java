import implementation.Employee;
import service.EmployeeAccount;
import service.FullTimeEmployee;
import service.PartTimeEmployee;

public class TeaPotApp {
    public static void main(String[] args) {

        FullTimeEmployee fullTime = new FullTimeEmployee();
     //   PartTimeEmployee partTime = new PartTimeEmployee();
        //new is not preferable, new always create new dependency. Sprint fm has advantage of it.

        EmployeeAccount employee = new EmployeeAccount(fullTime);
        employee.manageAccount();

        }

}