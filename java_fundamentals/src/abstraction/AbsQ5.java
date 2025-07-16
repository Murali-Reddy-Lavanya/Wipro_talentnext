package abstraction;
//Simulating: abstraction package
abstract class Vehicle2 {
 public abstract String getModelName();
 public abstract String getRegistrationNumber();
 public abstract String getOwnerName();
}

//Simulating: abstraction.twowheeler.Hero
class Hero1 extends Vehicle2 {
 @Override
 public String getModelName() {
     return "Hero Splendor Plus";
 }

 @Override
 public String getRegistrationNumber() {
     return "TS10AB1234";
 }

 @Override
 public String getOwnerName() {
     return "Ravi Kumar";
 }

 public int getSpeed() {
     return 70;
 }

 public void radio() {
     System.out.println("Radio: Playing FM channels...");
 }
}

//Simulating: abstraction.twowheeler.Honda
class Honda1 extends Vehicle2 {
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

//Simulating: abstraction.fourwheeler.Logan
class Logan extends Vehicle {
 @Override
 public String getModelName() {
     return "Renault Logan";
 }

 @Override
 public String getRegistrationNumber() {
     return "MH14QR4321";
 }

 @Override
 public String getOwnerName() {
     return "Amit Verma";
 }

 public int speed() {
     return 120;
 }

 public void gps() {
     System.out.println("GPS: Navigation system activated.");
 }
}

//Simulating: abstraction.fourwheeler.Ford
class Ford extends Vehicle {
 @Override
 public String getModelName() {
     return "Ford Ecosport";
 }

 @Override
 public String getRegistrationNumber() {
     return "DL8CAF9988";
 }

 @Override
 public String getOwnerName() {
     return "Neha Singh";
 }

 public int speed() {
     return 130;
 }

 public void tempControl() {
     System.out.println("Temperature Control: AC turned ON.");
 }
}

//Main test class
public class AbsQ5 {
 public static void main(String[] args) {
     System.out.println("=== Hero Vehicle ===");
     Hero hero = new Hero();
     System.out.println("Model: " + hero.getModelName());
     System.out.println("Reg No: " + hero.getRegistrationNumber());
     System.out.println("Owner: " + hero.getOwnerName());
     System.out.println("Speed: " + hero.getSpeed() + " km/h");
     hero.radio();

     System.out.println("\n=== Honda Vehicle ===");
     Honda honda = new Honda();
     System.out.println("Model: " + honda.getModelName());
     System.out.println("Reg No: " + honda.getRegistrationNumber());
     System.out.println("Owner: " + honda.getOwnerName());
     System.out.println("Speed: " + honda.getSpeed() + " km/h");
     honda.cdplayer();

     System.out.println("\n=== Logan Vehicle ===");
     Logan logan = new Logan();
     System.out.println("Model: " + logan.getModelName());
     System.out.println("Reg No: " + logan.getRegistrationNumber());
     System.out.println("Owner: " + logan.getOwnerName());
     System.out.println("Speed: " + logan.speed() + " km/h");
     logan.gps();

     System.out.println("\n=== Ford Vehicle ===");
     Ford ford = new Ford();
     System.out.println("Model: " + ford.getModelName());
     System.out.println("Reg No: " + ford.getRegistrationNumber());
     System.out.println("Owner: " + ford.getOwnerName());
     System.out.println("Speed: " + ford.speed() + " km/h");
     ford.tempControl();
 }
}

