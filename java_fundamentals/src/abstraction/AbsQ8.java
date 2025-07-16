package abstraction;

@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

public class AbsQ8 {
    public static void main(String[] args) {
        // t1: adds three numbers
        Test t1 = (a, b, c) -> a + b + c;

        // t2: multiplies three numbers
        Test t2 = (a, b, c) -> a * b * c;

        int result1 = t1.myFunction(2, 3, 4);  // 2 + 3 + 4 = 9
        int result2 = t2.myFunction(2, 3, 4);  // 2 * 3 * 4 = 24

        System.out.println("Sum = " + result1);
        System.out.println("Product = " + result2);
    }
}

