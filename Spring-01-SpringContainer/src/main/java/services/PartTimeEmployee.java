package services;

import interfaces.Employee;

public class PartTimeEmployee implements Employee {

    @Override
    public void createAccount() {
        System.out.println("Part Time Employee account is created..");
    }

}
