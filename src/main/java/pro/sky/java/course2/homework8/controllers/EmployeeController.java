package pro.sky.java.course2.homework8.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework8.classes.Employee;
import pro.sky.java.course2.homework8.services.EmployeeServiceImpl;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }

    @GetMapping(path = "/list")
    public Collection<Employee> getListOfEmployees() {
        return employeeServiceImpl.getListOfEmployees();
    }

    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                                @RequestParam("lastName") String lastName,
                                @RequestParam("departmentId") int departmentId,
                                @RequestParam("salary") int salary) {

        Employee employee = new Employee(firstName, lastName, departmentId, salary);
        employeeServiceImpl.addEmployee(firstName, lastName, departmentId, salary);
        return employee;

    }

    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName,
                                   @RequestParam("lastName") String lastName,
                                   @RequestParam("departmentId") int departmentId,
                                   @RequestParam("salary") int salary) {
        Employee removedEmployee = new Employee(firstName, lastName, departmentId, salary);
        employeeServiceImpl.removeEmployee(firstName, lastName, departmentId, salary);
        return removedEmployee;
    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName,
                                 @RequestParam("departmentId") int departmentId,
                                 @RequestParam("salary") int salary) {
        Employee foundEmployee = new Employee(firstName, lastName, departmentId, salary);
        employeeServiceImpl.findEmployee(firstName, lastName, departmentId, salary);
        return foundEmployee;
    }

}

