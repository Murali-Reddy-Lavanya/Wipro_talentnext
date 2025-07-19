package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee3 {
    int empNo;
    String name;
    int age;
    String location;

    // Parameterized constructor
    public Employee3(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Method to display employee details
    public void display() {
        System.out.println("EmpNo: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}

public class CSA2 {
    public static void main(String[] args) {
        // 1. Add 5 employees to the ArrayList
        List<Employee3> employees3 = new ArrayList<>();
        employees3.add(new Employee3(101, "Amit", 28, "Pune"));
        employees3.add(new Employee3(102, "Neha", 32, "Mumbai"));
        employees3.add(new Employee3(103, "Raj", 25, "Pune"));
        employees3.add(new Employee3(104, "Sneha", 30, "Delhi"));
        employees3.add(new Employee3(105, "Vikram", 27, "Pune"));

        // 2. Filter employees with location Pune
        List<Employee3> puneEmployees3 = employees3.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        // 3. Print details of employees from Pune
        System.out.println("Employees3 located in Pune:");
        for (Employee3 e : puneEmployees3) {
            e.display();
        }
    }
}
