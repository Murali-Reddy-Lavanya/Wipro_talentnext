package abstraction;
//Simulating: com.automobile package
abstract class Vehicle {
 public abstract String getModelName();
 public abstract String getRegistrationNumber();
 public abstract String getOwnerName();
}

//Simulating: com.automobile.twowheeler.Hero
class Hero extends Vehicle {
 @Override
 public String getModelName() {
     return "Hero Splendor X";
 }

 @Override
 public String getRegistrationNumber() {
     return "TS09AB1234";
 }

 @Override
 public String getOwnerName() {
     return "Rajesh Kumar";
 }

 public int getSpeed() {
     return 70;
 }

 public void radio() {
     System.out.println("Radio: Playing FM channels...");
 }
}

//Simulating: com.automobile.twowheeler.Honda
class Honda extends Vehicle {
 @Override
 public String getModelName() {
     return "Honda Activa 6G";
 }

 @Override
 public String getRegistrationNumber() {
     return "KA05XY9876";
 }

 @Override
 public String getOwnerName() {
     return "Sneha Reddy";
 }

 public int getSpeed() {
     return 60;
 }

 public void cdplayer() {
     System.out.println("CD Player: Playing your favorite CD...");
 }
}

//Test class
public class AbsQ4 {
 public static void main(String[] args) {
     System.out.println("=== Hero Vehicle ===");
     Hero hero = new Hero();
     System.out.println("Model Name: " + hero.getModelName());
     System.out.println("Registration Number: " + hero.getRegistrationNumber());
     System.out.println("Owner Name: " + hero.getOwnerName());
     System.out.println("Speed: " + hero.getSpeed() + " km/h");
     hero.radio();

     System.out.println("\n=== Honda Vehicle ===");
     Honda honda = new Honda();
     System.out.println("Model Name: " + honda.getModelName());
     System.out.println("Registration Number: " + honda.getRegistrationNumber());
     System.out.println("Owner Name: " + honda.getOwnerName());
     System.out.println("Speed: " + honda.getSpeed() + " km/h");
     honda.cdplayer();
 }
}
