// Parent class (Vehicle)
class Vehicle {
	protected String name;

	public Vehicle(String name) {
		this.name = name;
	}

	public void drive() {
		System.out.println(name + " is driving.");
	}
}

// Child class 1 (Car)
 class Car extends Vehicle {
	private int numDoors;

	public Car(String name, int numDoors) {
		super(name); // Calls Vehicle constructor
		this.numDoors = numDoors;
	}

	public void honk() {
		System.out.println(name + " is honking.");
	}
}

// Child class 2 (Motorcycle)
class Motorcycle extends Vehicle {
	private int engineSize;

	public Motorcycle(String name, int engineSize) {
		super(name); // Calls Vehicle constructor
		this.engineSize = engineSize;
	}

	public void rev() {
		System.out.println(name + " is revving.");
	}
}

// Child class 3 (Truck)
 class Truck extends Vehicle {
	private int cargoCapacity;

	public Truck(String name, int cargoCapacity) {
		super(name); // Calls Vehicle constructor
		this.cargoCapacity = cargoCapacity;
	}

	public void haul() {
		System.out.println(name + " is hauling.");
	}
}

// Main class
 class Main {
	public static void main(String[] args) {
		Car myCar = new Car("Toyota", 4);
		Motorcycle myMotorcycle = new Motorcycle("Harley Davidson", 1200);
		Truck myTruck = new Truck("Ford F-150", 1000);

		myCar.drive(); // Inherited from Vehicle
		myCar.honk(); // Defined in Car

		myMotorcycle.drive(); // Inherited from Vehicle
		myMotorcycle.rev(); // Defined in Motorcycle

		myTruck.drive(); // Inherited from Vehicle
		myTruck.haul(); // Defined in Truck
	}
}
