package com.example.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addPerson(String name, String lastName);

    Employee deletePerson(String name, String lastName);
    Employee findPerson(String name, String lastName);

    List<Employee> showAllPersons();
}
