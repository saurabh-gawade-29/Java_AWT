// Interface

interface Flyable {

    void fly(); // Abstract method

}

// Class implementing the interface
class Bird implements Flyable {

    public void fly() {
        System.out.println("Bird is flying...");
    }
}

// Another class implementing the interface
class Airplane implements Flyable {

    public void fly() {
        System.out.println("Airplane is flying...");
    }

}

public class FlyDemo {

    public static void main(String[] args) {
        // Using the interface with different classes
        Flyable sparrow = new Bird();
        Flyable boeing747 = new Airplane();

        // Calling the fly method
        sparrow.fly();
        boeing747.fly();
    }
}
