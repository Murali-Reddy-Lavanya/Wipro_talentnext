package collections;
import java.time.*;
public class CDT3 {
    public static void main(String[] args) {
        // Replace this with your actual Wipro joining date
        LocalDate joiningDate = LocalDate.of(2022, 6, 15); // Example: June 15, 2022

        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate period between joining date and today
        Period experience = Period.between(joiningDate, today);

        // Display experience
        System.out.println("Your experience in Wipro is:");
        System.out.println(experience.getYears() + " years");
        System.out.println(experience.getMonths() + " months");
        System.out.println(experience.getDays() + " days");
    }
}
