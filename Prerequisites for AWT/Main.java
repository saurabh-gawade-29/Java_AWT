
class Animal {

    // Fields
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {
        // Creating an object of the Animal class
        Animal dog = new Animal("Buddy", 3);

        // Calling a method on the object
        dog.displayInfo();
    }
}
