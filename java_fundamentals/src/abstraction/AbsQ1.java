package abstraction;
import java.util.*;
//Abstract Class
abstract class Compartment {
 public abstract String notice();
}

//Subclasses
class FirstClass extends Compartment {
 public String notice() {
     return "First Class Compartment";
 }
}

class Ladies extends Compartment {
 public String notice() {
     return "Ladies Compartment";
 }
}

class General extends Compartment {
 public String notice() {
     return "General Compartment";
 }
}

class Luggage extends Compartment {
 public String notice() {
     return "Luggage Compartment";
 }
}

//Main Class to Test
public class AbsQ1 {
 public static void main(String[] args) {
     Compartment[] compartments = new Compartment[10];

     for (int i = 0; i < compartments.length; i++) {
         int randomType = 1 + (int)(Math.random() * 4); // Generates random number between 1 and 4

         switch (randomType) {
             case 1:
                 compartments[i] = new FirstClass();
                 break;
             case 2:
                 compartments[i] = new Ladies();
                 break;
             case 3:
                 compartments[i] = new General();
                 break;
             case 4:
                 compartments[i] = new Luggage();
                 break;
         }
     }

     // Display the notices
     for (int i = 0; i < compartments.length; i++) {
         System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
     }
 }
}

