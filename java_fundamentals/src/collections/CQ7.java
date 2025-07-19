package collections;
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

// Employee class
class Employee2 {
    int empId;
    String empName;
    String department;

    public Employee2(int empId, String empName, String department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - " + department;
    }
}

public class CQ7 {
    public static void main(String[] args) {
        // Create a Vector to store Employee objects
        Vector<Employee2> employee2Vector = new Vector<>();

        // Add employee objects
        employee2Vector.add(new Employee2(101, "Alice", "HR"));
        employee2Vector.add(new Employee2(102, "Bob", "IT"));
        employee2Vector.add(new Employee2(103, "Charlie", "Finance"));

        // Print using Iterator
        System.out.println("Using Iterator:");
        Iterator<Employee2> iterator = employee2Vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Print using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee2> enumeration = employee2Vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

