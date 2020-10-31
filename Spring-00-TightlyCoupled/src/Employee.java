public class Employee {
    FullTimeEmployee fullTimeEmployee;
    PartTimeEmployee partTimeEmployee;

    public Employee(FullTimeEmployee fullTimeEmployee, PartTimeEmployee partTimeEmployee) {
        this.fullTimeEmployee = fullTimeEmployee;
        this.partTimeEmployee = partTimeEmployee;
    }

    public void manageAccount(){
        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();

    }
}
