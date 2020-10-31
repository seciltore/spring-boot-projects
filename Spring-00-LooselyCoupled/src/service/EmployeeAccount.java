package service;

import implementation.Employee;

public class EmployeeAccount {
    Employee employee;

    public EmployeeAccount(Employee employee) {
        this.employee = employee;
    }

    public void manageAccount(){
        this.employee.createAccount();
    }
}
