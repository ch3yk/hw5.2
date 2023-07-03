package com.example.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addPerson(String name, String lastName);

    Employee deletePerson(String name, String lastName);
    Employee findPerson(String name, String lastName);

    List<Employee> showAllPersons();

    Employee find(String firstName, String lastName);

    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    default List<Employee> getAll() {
        return null;
    }
}
