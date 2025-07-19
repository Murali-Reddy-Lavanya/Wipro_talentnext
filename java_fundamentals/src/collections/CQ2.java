package collections;
import java.util.ArrayList;

//Employee class
class Employee {
 int empId;
 String empName;
 String email;
 String gender;
 float salary;

 // Constructor
 public Employee(int empId, String empName, String email, String gender, float salary) {
     this.empId = empId;
     this.empName = empName;
     this.email = email;
     this.gender = gender;
     this.salary = salary;
 }

 // Method to print employee details
 public void getEmployeeDetails() {
     System.out.println("ID: " + empId);
     System.out.println("Name: " + empName);
     System.out.println("Email: " + email);
     System.out.println("Gender: " + gender);
     System.out.println("Salary: " + salary);
 }
}

//EmployeeDB class
class EmployeeDB {
 ArrayList<Employee> list = new ArrayList<>();

 // Add employee
 public boolean addEmployee(Employee e) {
     return list.add(e);
 }

 // Delete employee by ID
 public boolean deleteEmployee(int empId) {
     for (Employee e : list) {
         if (e.empId == empId) {
             list.remove(e);
             return true;
         }
     }
     return false;
 }

 // Show payslip
 public String showPaySlip(int empId) {
     for (Employee e : list) {
         if (e.empId == empId) {
             return "Pay slip for employee ID " + empId + " is: ₹" + e.salary;
         }
     }
     return "Employee not found.";
 }

 // Optional: display all employee details
 public void displayAllEmployees() {
     for (Employee e : list) {
         System.out.println("---------------");
         e.getEmployeeDetails();
     }
 }
}

//Main class to test
public class CQ2 {
 public static void main(String[] args) {
     Employee e1 = new Employee(101, "Ravi", "ravi@example.com", "Male", 50000f);
     Employee e2 = new Employee(102, "Priya", "priya@example.com", "Female", 60000f);
     Employee e3 = new Employee(103, "Amit", "amit@example.com", "Male", 55000f);

     EmployeeDB db = new EmployeeDB();

     // Adding employees
     db.addEmployee(e1);
     db.addEmployee(e2);
     db.addEmployee(e3);

     // Display all
     System.out.println("All Employees:");
     db.displayAllEmployees();

     // Show pay slip
     System.out.println("\n" + db.showPaySlip(102));

     // Delete employee
     boolean deleted = db.deleteEmployee(101);
     System.out.println("\nEmployee ID 101 deleted: " + deleted);

     // Display after deletion
     System.out.println("\nUpdated Employee List:");
     db.displayAllEmployees();
 }
}

