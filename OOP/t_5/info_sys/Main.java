package OOP.t_5.info_sys;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Employee("John Smith", 30, 5000));
        company.addEmployee(new Employee("Sarah Johnson", 25, 4000));

        List<Employee> employees = company.getEmployees();
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName() + ", Age: " + employee.getAge() + ", Salary: "
                    + employee.getSalary());
        }

        University university = new University();
        university.addStudent(new Student("Alex Brown", 20, "Harvard University"));
        university.addStudent(new Student("Emily Davis", 22, "Stanford University"));

        List<Student> students = university.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", University: "
                    + student.getUniversity());
        }

        School school = new School();
        school.addSchoolStudent(new SchoolStudent("Mike Jackson", 16, "High School A"));
        school.addSchoolStudent(new SchoolStudent("Emma Wilson", 15, "High School B"));

        List<SchoolStudent> schoolStudents = school.getSchoolStudents();
        for (SchoolStudent schoolStudent : schoolStudents) {
            System.out.println("School Student: " + schoolStudent.getName() + ", Age: " + schoolStudent.getAge()
                    + ", School: " + schoolStudent.getSchool());
        }
    }
}
