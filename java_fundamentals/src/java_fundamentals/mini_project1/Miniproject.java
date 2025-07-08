package java_fundamentals.mini_project1;
//import java.util.*;
public class Miniproject {
	    static class Employee {
	        int empNo;
	        String empName;
	        String department;
	        char designationCode;
	        int basic;
	        int hra;
	        int it;

	        Employee(int empNo, String empName, String department, char designationCode, int basic, int hra, int it) {
	            this.empNo = empNo;
	            this.empName = empName;
	            this.department = department;
	            this.designationCode = designationCode;
	            this.basic = basic;
	            this.hra = hra;
	            this.it = it;
	        }
	    }
        
	    public static void main(String[] args) {
	        if (args.length != 1) {
	            System.out.println("Please provide an employee ID as a command-line argument.");
	            return;
	        }

	        int empId;
	        try {
	            empId = Integer.parseInt(args[0]);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid employee ID format.");
	            return;
	        }

	        Employee[] employees = {
	            new Employee(1001, "Ashish", "R&D", 'e', 20000, 8000, 3000),
	            new Employee(1002, "Sushma", "PM", 'c', 30000, 12000, 9000),
	            new Employee(1003, "Rahul", "Acct", 'k', 10000, 8000, 1000),
	            new Employee(1004, "Chahat", "Front Desk", 'r', 12000, 6000, 2000),
	            new Employee(1005, "Ranjan", "Engg", 'm', 50000, 20000, 20000),
	            new Employee(1006, "Suman", "Manufacturing", 'e', 23000, 9000, 4400),
	            new Employee(1007, "Tanmay", "PM", 'c', 29000, 12000, 10000)
	        };

	        boolean found = false;
	        for (Employee emp : employees) {
	            if (emp.empNo == empId) {
	                found = true;

	                // Determine designation and DA
	                String designation = "";
	                int DA = 0;

	                switch (emp.designationCode) {
	                    case 'e':
	                        designation = "Engineer";
	                        DA = 20000;
	                        break;
	                    case 'c':
	                        designation = "Consultant";
	                        DA = 32000;
	                        break;
	                    case 'k':
	                        designation = "Clerk";
	                        DA = 12000;
	                        break;
	                    case 'r':
	                        designation = "Receptionist";
	                        DA = 15000;
	                        break;
	                    case 'm':
	                        designation = "Manager";
	                        DA = 40000;
	                        break;
	                    default:
	                        designation = "Unknown";
	                }

	                // Calculate salary
	                int salary = emp.basic + emp.hra + DA - emp.it;

	                System.out.printf("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary\n");
	                System.out.printf("%d\t%s\t%s\t%s\t%d\n", emp.empNo, emp.empName, emp.department, designation, salary);
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("There is no employee with empid : " + empId);
	        }
	    }
        }

