package com.jpmc.anil.mybatis.service;

public class EmployeePK {
    private String employeeId;
    private String firstName;
    private String lastName;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeePK [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
