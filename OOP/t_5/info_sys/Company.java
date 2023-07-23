package OOP.t_5.info_sys;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    // Другие методы для работы с сотрудниками компании
}
