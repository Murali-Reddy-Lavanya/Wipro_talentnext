package collections;
import java.util.*;
import java.util.function.Predicate;

class Employee5 {
    private int id;
    private String name;
    private double salary;

    // Parameterized constructor
    public Employee5(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class CFI4 {
    public static void main(String[] args) {
        // Creating a list of Employee objects
        List<Employee5> employees5 = new ArrayList<>();
        employees5.add(new Employee5(101, "Alice", 9500));
        employees5.add(new Employee5(102, "Bob", 12000));
        employees5.add(new Employee5(103, "Charlie", 8000));
        employees5.add(new Employee5(104, "Diana", 15000));
        employees5.add(new Employee5(105, "Eve", 9800));

        // Predicate to filter employees with salary less than 10000
        Predicate<Employee5> lowSalary = emp -> emp.getSalary() < 10000;

        System.out.println("Employees5 with salary less than 10000:");
        for (Employee5 emp : employees5) {
            if (lowSalary.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}



