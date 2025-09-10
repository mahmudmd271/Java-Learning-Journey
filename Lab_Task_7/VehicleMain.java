import java.util.ArrayList;

class Vehicle {
    private String brand;
    private String model;
    private double price;
    private String color;

    public Vehicle(String brand, String model, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: " + price + ", Color: " + color;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, double price, String color, int numDoors) {
        super(brand, model, price, color);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numDoors;
    }
}

class Motorcycle extends Vehicle {
    private double engineCapacity;

    public Motorcycle(String brand, String model, double price, String color, double engineCapacity) {
        super(brand, model, price, color);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Engine Capacity: " + engineCapacity + " cc";
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car car1 = new Car("Toyota", "Camry", 25000, "Blue", 4);
        Motorcycle bike1 = new Motorcycle("Honda", "CBR", 12000, "Red", 600.0);

        vehicles.add(car1);
        vehicles.add(bike1);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}
