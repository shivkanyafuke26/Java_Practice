class SingleToneStudent{

String name;
String branch;

private SingleToneStudent(String name, String branch){
	this.name=name;
	this.branch=branch;
}
public static void storage() {
	System.out.println("Hello from storage");
}
public static void main(String[] args) {
	System.out.println("Hello from Student Main");
	SingleToneStudent obj=new  SingleToneStudent("Ramesh","Mech");
	//System.out.println(obj);
	SingleToneStudent obj1=new  SingleToneStudent("Suresh","CSE");
	//System.out.println(obj1);
	if(obj==null){
		System.out.println(obj1);
		obj1.storage();
	}
	else{
		System.out.println(obj);
	}
}
}