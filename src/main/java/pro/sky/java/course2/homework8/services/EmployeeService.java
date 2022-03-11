package pro.sky.java.course2.homework8.services;

import pro.sky.java.course2.homework8.model.Employee;

import java.util.Collection;

public interface EmployeeService {



    Employee addEmployee(String firstName, String lastName, int departmentId, int salary);

    Employee removeEmployee(String firstName, String lastName, int departmentId, int salary);

    Employee findEmployee(String firstName, String lastName, int departmentId, int salary);

    Collection<Employee> getListOfEmployees();
}
