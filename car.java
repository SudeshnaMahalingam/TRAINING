class car {  
    String brand;
    String model;
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }
}
public class CarDemo {
    public static void main(String[] args) {       
        Car myCar = new Car("Toyota", "Fortuner"); 
        myCar.displayDetails();
    }
}
