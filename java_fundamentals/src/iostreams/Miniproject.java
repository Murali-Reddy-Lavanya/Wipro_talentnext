package iostreams;
import java.io.*;
import java.util.*;

class Employee1 {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toFileString() {
        return id + "," + name + "," + age + "," + salary;
    }

    public static Employee1 fromFileString(String line) {
        String[] parts = line.split(",");
        if (parts.length != 4) return null;
        try {
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            int age = Integer.parseInt(parts[2]);
            double salary = Double.parseDouble(parts[3]);
            return new Employee1(id, name, age, salary);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class Miniproject {
    private static final String FILE_NAME = "employees.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    displayAllEmployees();
                    break;
                case "3":
                    System.out.println("Exiting the System");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee() {
        try {
            System.out.print("Enter Employee ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Employee Salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            Employee1 emp = new Employee1(id, name, age, salary);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
                writer.write(emp.toFileString());
                writer.newLine();
            }
            System.out.println("Employee1 added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for ID, age, and salary.");
        }
    }

    private static void displayAllEmployees() {
        System.out.println("----Report-----");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean hasData = false;
            while ((line = reader.readLine()) != null) {
                Employee1 emp = Employee1.fromFileString(line);
                if (emp != null) {
                    System.out.println(emp);
                    hasData = true;
                }
            }
            if (!hasData) {
                System.out.println("No employee1 records found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No employee1 records found.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        System.out.println("----End of Report-----");
    }
}

