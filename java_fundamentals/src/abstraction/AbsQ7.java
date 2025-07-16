package abstraction;

interface Vehicle1 {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

public class AbsQ7 implements Vehicle1, FourWheeler {
    @Override
    public void message() {
        System.out.println("Inside Car");
        Vehicle1.super.message();
        // FourWheeler.super.message(); // optional
    }

    public static void main(String[] args) {
        AbsQ7 car = new AbsQ7();
        car.message();
    }
}


