package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elvis
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee emploee) {
        subordinates.add(emploee);
    }

    public void remove(Employee emploee) {
        subordinates.remove(emploee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return "Employee: [Name:" + name + ", dept: " + dept + ", salary: " + salary + "]";
    }
}
