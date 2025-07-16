package wrapper_class;
class Employee implements Cloneable {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Setters for changing properties
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department + "]";
    }
}

public class Wp4 {
    public static void main(String[] args) {
        try {
            // Create original object
            Employee original = new Employee(101, "Alice", "HR");

            // Clone it
            Employee clone = (Employee) original.clone();

            // Change original's properties
            original.setName("Bob");
            original.setDepartment("Finance");

            // Print both objects
            System.out.println("Original Employee: " + original);
            System.out.println("Cloned Employee:   " + clone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

