package com.jpmc.anil.mybatis.service;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        List<EmployeeWrapper> employees = employeeService.findAllEmployees();
        System.out.println(employees);
    }
}
