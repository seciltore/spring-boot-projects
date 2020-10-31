public class TeaPotApp {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee();
        PartTimeEmployee partTime = new PartTimeEmployee();

        Employee employee = new Employee(fullTime, partTime);
        employee.manageAccount();
    }
}
