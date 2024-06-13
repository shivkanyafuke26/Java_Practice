class Vehicle 
{
    String brand;
    int year;
    String color;
    double price;
    double mileage;
    int maxSpeed;
    
    public Vehicle(String brand, int year, String color, double price, double mileage, int maxSpeed) 
    {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.maxSpeed = maxSpeed;
    }
    
    public void display() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + " mpg");
        System.out.println("Max Speed: " + maxSpeed + " mph");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle 
{
    int numberOfDoors;
    
    public Car(String brand, int year, String color, double price, double mileage, int maxSpeed, int numberOfDoors) 
    {
        super(brand, year, color, price, mileage, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }
    
    public void display() 
    {
        super.display(); // calling display() method of parent class
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

public class SingleInheritance1 
{
    public static void main(String[] args) 
    {
        // Creating an object of Car
        Car myCar = new Car("Toyota", 2022, "Red", 25000.00, 25.5, 120, 4);
        
        // Calling display() method of Car class
        myCar.display();
    }
}