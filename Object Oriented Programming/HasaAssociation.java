
/*
class Car{
	
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;

	Car(String brand,String model,String type,double price,int seatingCapacity)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
 		this.engine= new Engine(120,1.2,"PETROL",16,4);
		
	}
	public void display(){
		System.out.println("****** Car Detail *******");
		System.out.println("brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Seating Capacity : "+seatingCapacity);
		System.out.println();
	}
}

class Engine{
	double horsePower;
	double capacityLitre;
	String engineType;
	double mileage;
	int noOfPiston;

	Engine(double horsePower,double capacityLitre,String engineType,double mileage,int noOfPiston)
	{
		this.horsePower=horsePower;
		this.capacityLitre=capacityLitre;
		this.engineType=engineType;
		this.mileage=mileage;
		this.noOfPiston=noOfPiston;
	} 
	public void displayEngine(){
		System.out.println("***** Engine Detail *****");
		System.out.println("Horse Power : "+horsePower);
		System.out.println("Capacity in Liter : "+capacityLitre);
		System.out.println("Engine Type : "+engineType);
		System.out.println("Mileage : "+mileage);
		System.out.println("No. Of Piston : "+noOfPiston);
		System.out.println();
	}

}

class HasaAssociation{
	public static void main(String[] args) {
	//Car obj=new Car("ABC","DEF","ENGINE",200000,4,120,1.2,"SUV",16,4);
	Car obj=new Car("ABC","DEF","ENGINE",200000,4);
	obj.display();
	obj.engine.displayEngine();	
	}
}

System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

class Car{
	
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;

	Car(String brand,String model,String type,double price,int seatingCapacity,double horsePower,double capacityLitre,String engineType,double mileage,int noOfPiston)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
		this.engine= new Engine(horsePower,capacityLitre,engineType,mileage,noOfPiston);
	}
	public void display(){
		System.out.println("****** Car Detail *******");
		System.out.println("brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Seating Capacity : "+seatingCapacity);
		System.out.println();
	}
}

class Engine{
	double horsePower;
	double capacityLitre;
	String engineType;
	double mileage;
	int noOfPiston;

	Engine(double horsePower,double capacityLitre,String engineType,double mileage,int noOfPiston){
		this.horsePower=horsePower;
		this.capacityLitre=capacityLitre;
		this.engineType=engineType;
		this.mileage=mileage;
		this.noOfPiston=noOfPiston;
	} 
	public void displayEngine(){
		System.out.println("***** Engine Detail *****");
		System.out.println("Horse Power : "+horsePower);
		System.out.println("Capacity in Liter : "+capacityLitre);
		System.out.println("Engine Type : "+engineType);
		System.out.println("Mileage : "+mileage);
		System.out.println("No. Of Piston : "+noOfPiston);
		System.out.println();
	}

}

class HasaAssociation{
	public static void main(String[] args) {
	Car obj=new Car("ABC","DEF","ENGINE",200000,4,120,1.2,"SUV",16,4);
	obj.display();
	obj.engine.displayEngine();	
	}
}

System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");


class Car{
	
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;

	Car(String brand,String model,String type,double price,int seatingCapacity,Engine engine)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
		this.engine=engine;
	}
	public void display(){
		System.out.println("****** Car Detail *******");
		System.out.println("brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Seating Capacity : "+seatingCapacity);
		System.out.println();
	}
}

class Engine{
	double horsePower;
	double capacityLitre;
	String engineType;
	double mileage;
	int noOfPiston;

	Engine(double horsePower,double capacityLitre,String engineType,double mileage,int noOfPiston){
		this.horsePower=horsePower;
		this.capacityLitre=capacityLitre;
		this.engineType=engineType;
		this.mileage=mileage;
		this.noOfPiston=noOfPiston;
	} 
	public void displayEngine(){
		System.out.println("***** Engine Detail *****");
		System.out.println("Horse Power : "+horsePower);
		System.out.println("Capacity in Liter : "+capacityLitre);
		System.out.println("Engine Type : "+engineType);
		System.out.println("Mileage : "+mileage);
		System.out.println("No. Of Piston : "+noOfPiston);
		System.out.println();
	}

}

class HasaAssociation{
	public static void main(String[] args) {
	Car obj=new Car("ABC","DEF","ENGINE",200000,4,new Engine(120,1.2,"SUV",16,4));
	obj.display();
	obj.engine.displayEngine();	
	}
}

System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");

*/


/*
class Car{
	
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine=new Engine(120,1.2,"SUV",16,4);

	Car(String brand,String model,String type,double price,int seatingCapacity)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
		this.engine=engine;
	}
	public void display(){
		System.out.println("****** Car Detail *******");
		System.out.println("brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Seating Capacity : "+seatingCapacity);
		System.out.println();
	}
}

class Engine{
	double horsePower;
	double capacityLitre;
	String engineType;
	double mileage;
	int noOfPiston;

	Engine(double horsePower,double capacityLitre,String engineType,double mileage,int noOfPiston){
		this.horsePower=horsePower;
		this.capacityLitre=capacityLitre;
		this.engineType=engineType;
		this.mileage=mileage;
		this.noOfPiston=noOfPiston;
	} 
	public void displayEngine(){
		System.out.println("***** Engine Detail *****");
		System.out.println("Horse Power : "+horsePower);
		System.out.println("Capacity in Liter : "+capacityLitre);
		System.out.println("Engine Type : "+engineType);
		System.out.println("Mileage : "+mileage);
		System.out.println("No. Of Piston : "+noOfPiston);
		System.out.println();
	}

}

class HasaAssociation{
	public static void main(String[] args) {
	Car obj=new Car("ABC","DEF","ENGINE",200000,4);
	obj.display();
	obj.engine.displayEngine();	
	}
}

*/