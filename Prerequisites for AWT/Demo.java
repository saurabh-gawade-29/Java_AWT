// Parent Class

class Vehicle {

    //! Method
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child Class
class Car extends Vehicle {

    //! Method
    void honk() {
        System.out.println("Car is honking...");
    }
}

public class Demo {

    public static void main(String[] args) {
        // Creating an object of the child class
        Car myCar = new Car();

        // Calling methods from both the parent and child classes
        myCar.start(); // Inherited method
        myCar.honk();  // Child class method
    }
}
