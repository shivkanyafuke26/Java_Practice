class Electronics
{
	int id;
	String name;
	double price;
	String brand;

	Electronics(int id, String name,double price,String brand)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		this.brand=brand;
	}
	void displayElectronics()
	{
		System.out.println();
		System.out.println("***** Electronics Details *******");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Brand : "+brand);
	}
}
class Mobile extends Electronics
{
	double screenSize;
	double batteryLife;
	String operatingSystem;

	Mobile(double screenSize,double batteryLife,String operatingSystem,int id, String name,double price,String brand)
	{
		super(id,name,price,brand);
		this.screenSize=screenSize;
		this.batteryLife=batteryLife;
		this.operatingSystem=operatingSystem;
	}
	void displayMobile()
	{
		System.out.println();
		System.out.println("***** Mobile Details *****");
		System.out.println("Screen Size : "+screenSize);
		System.out.println("Battery Life : "+batteryLife);
		System.out.println("Operating System : "+operatingSystem);
	}
}
class SmartPhone extends Mobile
{	
	String cameraResolution;
	double storageCapacity;
	double processorSpeed;

	SmartPhone(String cameraResolution,double storageCapacity,double processorSpeed,double screenSize,double batteryLife,String operatingSystem,int id, String name,double price,String brand)
	{
		super(screenSize,batteryLife,operatingSystem,id,name,price,brand);
		this.cameraResolution=cameraResolution;
		this.storageCapacity=storageCapacity;
		this.processorSpeed=processorSpeed;
	}
	void displaySmartPhone()
	{
		System.out.println();
		System.out.println("***** SmartPhone Details ******");
		System.out.println("Camera Resolution : "+cameraResolution+" pixel");
		System.out.println("Storage Capacity : "+storageCapacity);
		System.out.println("processor Speed : "+processorSpeed);
	}
}
class Apple extends SmartPhone
{
	double storage;
	boolean waterResistant;
	boolean fingerPrint;
	int generation;

	Apple(double storage, boolean waterResistant, boolean fingerPrint , int generation,String cameraResolution,double storageCapacity,double processorSpeed,double screenSize,double batteryLife,String operatingSystem,int id, String name,double price,String brand)
	{
		super(cameraResolution,storageCapacity,processorSpeed,screenSize,batteryLife,operatingSystem,id,name,price,brand);
		this.storage=storage;
		this.waterResistant=waterResistant;
		this.fingerPrint=fingerPrint;
		this.generation=generation;
	}
	void displayApple()
	{
		System.out.println();
		System.out.println("****** Apple Detail *******");
		System.out.println("Storage : "+storage);
		System.out.println("Wtaer Resistant : "+waterResistant);
		System.out.println("Finger print : "+fingerPrint);
		System.out.println("generation : "+generation+" i");
	}

}
class ElectronicDriver
{
	public static void main(String[] args) 
	{
		Apple apple=new Apple(128,true,true,4,"2532X1170",426,128,2,12,"Android",123,"Mobile",120000,"Apple");
		apple.displayElectronics();
		apple.displayMobile();
		apple.displaySmartPhone();
		apple.displayApple();

		
	}
}