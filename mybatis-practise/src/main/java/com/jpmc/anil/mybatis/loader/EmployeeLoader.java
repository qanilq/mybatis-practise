package com.jpmc.anil.mybatis.loader;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.hazelcast.core.MapLoader;
import com.jpmc.anil.mybatis.service.Employee;
import com.jpmc.anil.mybatis.service.EmployeeService;

public class EmployeeLoader implements MapLoader<String, Employee> {

    EmployeeService       employeeService = new EmployeeService();
    Map<String, Employee> map             = new HashMap<String, Employee>();

    public EmployeeLoader() {
        // List<Employee> employees = employeeService.findAllEmployees();
        int i = 0;
        // for (Employee employee : employees) {
        // if (employee.getEmployeeId() != null) {
        // i++;
        // map.put(employee.getEmployeeId(), employee);
        // }
        // }
        System.out.println("Total employees:" + i);
    }

    public void initMap() {
    }

    @Override
    public Employee load(String employeeId) {
        return map.get(employeeId);
    }

    @Override
    public Map<String, Employee> loadAll(Collection<String> keys) {
        return map;
    }

    @Override
    public Set<String> loadAllKeys() {
        return map.keySet();
    }

}
