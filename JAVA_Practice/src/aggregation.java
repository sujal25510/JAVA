
class Address {
    String state;
    String city;

    public Address(String city, String state) {


        this.city = city;
        this.state = state;
    }
}

class student {
    int id;
    String name;
    Address address;


    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }



    void display() {
        System.out.println("ID: " + id + " | " + "name: " + name+"address: "+address.city);
    }
}



public class aggregation {
    public static void main(String args[]){
        Address a1 = new Address("City","State");
        student s1 = new Student(1,"John",a1);
        s1.display();
    }
}

// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.

// Superclass Vehicle
class Vehicle {
    private String identificationNumber;
    private double maxSpeed;


    public Vehicle(String identificationNumber, double maxSpeed) {
        this.identificationNumber = identificationNumber;
        this.maxSpeed = maxSpeed;
    }


    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public void displayDetails() {
        System.out.println("Vehicle ID: " + identificationNumber);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}


class Car extends Vehicle {
    private int numberOfPassengers;

    public Car(String identificationNumber, double maxSpeed, int numberOfPassengers) {
        super(identificationNumber, maxSpeed);
        this.numberOfPassengers = numberOfPassengers;
    }


    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}


class Truck extends Vehicle {
    private double maxWeight;


    public Truck(String identificationNumber, double maxSpeed, double maxWeight) {
        super(identificationNumber, maxSpeed);
        this.maxWeight = maxWeight;
    }


    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Max Weight: " + maxWeight + " tons");
    }
}


class Bicycle extends Vehicle {

    public Bicycle(String identificationNumber, double maxSpeed) {
        super(identificationNumber, maxSpeed);
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}


public class TransportationSystem {
    public static void main(String[] args) {
        // Creating instances of each type of vehicle
        Car car = new Car("C001", 120.0, 4);
        Truck truck = new Truck("T001", 80.0, 10.0);
        Bicycle bicycle = new Bicycle("B001", 25.0);

        // Demonstrating inheritance by calling methods
        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nTruck Details:");
        truck.displayDetails();

        System.out.println("\nBicycle Details:");
        bicycle.displayDetails();
    }
}
