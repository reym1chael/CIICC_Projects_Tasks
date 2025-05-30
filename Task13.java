
class Vehicle {         // The base class Car with the attributes
    String make;
    String model;
    int year;
    
}

class Car extends Vehicle {   // derived class that extends Vehicle class with additional attribute
    int numberOfDoors;

    public Car (String make, String model, int year, int numberOfDoors){
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails(){ //implemented a method in Car class that prints
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors + "\n");

    }
}

public class Task13 {
    public static void main(String[] args) {
        Car [] cars = new Car[]{
            new Car("Toyota", "Camry", 2022, 4),
            new Car("Nissan", "Sentra", 2018, 4),
            new Car("Dodge", "Challenger", 2023, 2),
            new Car("Lamborghini", "Gallardo", 2022, 2),
            new Car("Ferarri", "Speciale", 2025, 2),
            new Car("Honda", "Accord", 2022, 4)
        };
        for (int i = 0; i < cars.length; i++){
            cars[i].displayDetails();
        }
        }
    }

