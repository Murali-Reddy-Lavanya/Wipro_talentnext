package abstraction;
class Foundation {
    private int var1 = 10;        // Private
    int var2 = 20;                // Default (Package-private)
    protected int var3 = 30;      // Protected
    public int var4 = 40;         // Public

    public void showValuesWithinClass() {
        System.out.println("Inside Foundation class:");
        System.out.println("Private var1: " + var1);     // ✅ Accessible
        System.out.println("Default var2: " + var2);     // ✅ Accessible
        System.out.println("Protected var3: " + var3);   // ✅ Accessible
        System.out.println("Public var4: " + var4);      // ✅ Accessible
    }
}

public class AbsQ2 {
    public static void main(String[] args) {
        Foundation obj = new Foundation();

        System.out.println("Accessing from another class (AccessTest):");
        // System.out.println("Private var1: " + obj.var1);     // ❌ Not accessible
        System.out.println("Default var2: " + obj.var2);         // ✅ Accessible (same file, same default package)
        System.out.println("Protected var3: " + obj.var3);       // ✅ Accessible (same package)
        System.out.println("Public var4: " + obj.var4);          // ✅ Accessible

        obj.showValuesWithinClass(); // Shows internal access to all
    }
}

