package service;

import implementation.Employee;

public class PartTimeEmployee implements Employee {

    @Override
    public void createAccount() {
        System.out.println("Part Time Employee account is created");
    }
}
