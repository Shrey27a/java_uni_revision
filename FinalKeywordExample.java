 // Final class
  final class Vehicle {
    String type;

    // Constructor to initialize the type of vehicle
    Vehicle(String type) {
        this.type = type;
    }

    // Method to display the type of vehicle
    void display() {
        System.out.println("Vehicle type: " + type);
    }
}

// This class will cause an error because Vehicle is final and cannot be inherited.
class Car extends Vehicle {  // This will cause a compilation error
    String brand;

    Car(String type, String brand) {
        super(type);
        this.brand = brand;
    }

    void displayDetails() {
        display();
        System.out.println("Car brand: " + brand);
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        // Creating an object of the Vehicle class
        Vehicle v = new Vehicle("Two-Wheeler");
        v.display();

        // Creating an object of the Car class
        // This will fail to compile because the Vehicle class is final
        // Car c = new Car("Four-Wheeler", "Toyota");
        // c.displayDetails();
    }
}
 