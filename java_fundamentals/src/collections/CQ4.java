package collections;
import java.util.ArrayList;

public class CQ4 {
    public static void main(String[] args) {
        // ArrayList that stores only objects of types extending Number
        ArrayList<Number> numberList = new ArrayList<>();

        // Adding different number types
        numberList.add(10);         // Integer
        numberList.add(15.5);       // Double
        numberList.add(3.14f);      // Float
        numberList.add(100L);       // Long

        // Uncommenting below line will cause compile-time error
        // numberList.add("Hello");  // ❌ Not a Number

        // Printing the list
        System.out.println("Numbers in the list:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}

