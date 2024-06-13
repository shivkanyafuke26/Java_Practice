import java.util.*;
class ProgrammingLanguage{

	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extension;	

	ProgrammingLanguage(String type,String level,int inventedYear,String founderName,double latestVersion,String extension)
	{
		super();
	 	this.type=type;
	 	this.level=level;
		this.inventedYear=inventedYear;
	 	this.founderName=founderName;
	 	this.latestVersion=latestVersion;
	 	this.extension=extension;	


	}

	public void displayProgrammingLanguage()
	{
		System.out.println("****Programming Language****");
		System.out.println("Type : "+this.type);
		System.out.println("Level : "+this.level);
		System.out.println("Invented Year : "+this.inventedYear);
		System.out.println("Founder Name : "+this.founderName);
		System.out.println("Latest Version : JDK "+this.latestVersion);
		System.out.println("Extension : "+this.extension);
		System.out.println();
	}
}

class Java extends ProgrammingLanguage
{
	String [] features;
	boolean platformIndependent;

	Java(String[] features, boolean platformIndependent,String type,String level,int inventedYear,String founderName,double latestVersion,String extension)
	{
		super(type,level,inventedYear,founderName,latestVersion,extension);
		this.features=features;
		this.platformIndependent=platformIndependent;
	}
	public void displayJava()
	{
		System.out.println("**** Java Langugae ****");
		System.out.println("Features : "+Arrays.toString(this.features));
		System.out.println("platform Independent : "+this.platformIndependent);
	}
}


class SingleInheritance{
	public static void main(String[] args) 
	{
	String [] features={"1.Multithreaded","2.secure & Robust","3.Portable","4.Dynamic"};
	Java obj= new Java(features,true,"object oriented","High level ",1991,"James Gosling",1.22,".java");
	obj.displayProgrammingLanguage();
	obj.displayJava();		
	}
}