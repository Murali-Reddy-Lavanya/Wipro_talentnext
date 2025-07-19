package iostreams;
import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class Q4 {
    public static void main(String[] args) {
        String fileName = "data";

        // Creating an Employee object
        Employee emp = new Employee("Lavanya Reddy", new Date(100, 4, 15), "IT", "Software Engineer", 75000.0);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("\nDeserialized Employee Details:");
            System.out.println("Name: " + deserializedEmp.getName());
            System.out.println("DOB: " + deserializedEmp.getDateOfBirth());
            System.out.println("Department: " + deserializedEmp.getDepartment());
            System.out.println("Designation: " + deserializedEmp.getDesignation());
            System.out.println("Salary: " + deserializedEmp.getSalary());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

