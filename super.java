
class Vehicle {
    String brand;
    int year;

    // Constructor of superclass
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Subclass
class Car extends Vehicle {
    String model;

    
    Car(String brand, int year, String model) {
        
        super(brand, year);
        this.model = model;
    }

    void displayDetails() {
        
        super.displayInfo();
        System.out.println("Model: " + model);
    }
}


public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Toyota", 2022, "Corolla");

        
        car1.displayDetails();
    }
}
