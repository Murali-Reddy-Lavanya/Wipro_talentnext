package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee4 {
    int id;
    String name;
    String location;
    double salary;

    // Constructor
    public Employee4(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class CFI1 {
    public static void main(String[] args) {
        // Create ArrayList of Employees
        List<Employee4> employeeList = new ArrayList<>();
        employeeList.add(new Employee4(101, "Amit", "Mumbai", 50000));
        employeeList.add(new Employee4(102, "Sneha", "Pune", 60000));
        employeeList.add(new Employee4(103, "Raj", "Delhi", 55000));
        employeeList.add(new Employee4(104, "Nisha", "Bangalore", 62000));
        employeeList.add(new Employee4(105, "Kiran", "Hyderabad", 58000));

        // Function to extract location from Employee
        Function<Employee4, String> extractLocation = emp -> emp.location;

        // Store all locations into a new ArrayList
        List<String> locationList = new ArrayList<>();
        for (Employee4 emp : employeeList) {
            locationList.add(extractLocation.apply(emp));
        }

        // Print the extracted locations
        System.out.println("Employee Locations:");
        locationList.forEach(System.out::println);
    }
}

