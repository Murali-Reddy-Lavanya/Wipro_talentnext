package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int mark;

    // Parameterized constructor
    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class CSA3 {
    public static void main(String[] args) {
        // 1. Add five students to the ArrayList
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Arjun", 45));
        students.add(new Student(2, "Sneha", 78));
        students.add(new Student(3, "Ravi", 52));
        students.add(new Student(4, "Meera", 36));
        students.add(new Student(5, "Kiran", 85));

        // 2. Filter students who scored >= 50
        List<Student> passedStudents = students.stream()
                .filter(s -> s.mark >= 50)
                .collect(Collectors.toList());

        // 3. Print the count
        System.out.println("Number of students who cleared the test: " + passedStudents.size());
    }
}
