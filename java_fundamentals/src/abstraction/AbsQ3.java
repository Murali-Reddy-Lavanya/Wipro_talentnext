package abstraction;
public class AbsQ3 {
    private double height;
    private double width;
    private double breadth;

    // Constructor
    public AbsQ3(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Method to calculate volume
    public double getVolume() {
        return height * width * breadth;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Ship Compartment Dimensions:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
        System.out.println("Volume: " + getVolume());
    }

    // Main method inside same class
    public static void main(String[] args) {
        AbsQ3 comp = new AbsQ3(10.0, 5.0, 3.0);
        comp.displayInfo();
    }
}

