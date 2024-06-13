class Human
{
	String name;
	String gender;
	Human(String name,String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	} 
	 void eat() 
	 {
	 	System.out.println("Human can eat");
	 }
	 void walk() 
	 {
	 	System.out.println("Human can walk");
	 }
	 void think() 
	 {
	 	System.out.println("Human can think");
	 }
	 void speak() 
	 {
	 	System.out.println("Human can speak");
	 }
	 void displayHuman()
	 {
	 	System.out.println();
	 	System.out.println("****** Human Details ******");
	 	System.out.println("Name : "+name);
	 	System.out.println("Gender : "+gender);
	 }
}
class Graduation extends Human
{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graduation(String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(name,gender);
	    this.course=course;
		this.duration=duration;
		this.branch=branch;
		this.university=university;
		this.yop=yop;
	}
	void displayGraduation()
	{
		System.out.println();
		System.out.println("******** Gradution Details **********");
		System.out.println("Course : "+this.course);
		System.out.println("Duration : "+this.duration);
		System.out.println("Branch : "+this.branch);
		System.out.println("university : "+this.university);
		System.out.println("YOP : "+this.yop);
	}
}
class PostGraduation extends Graduation
{
	String  specialization;
	int 	durationpg;
	int 	yoppg;
	String 	universitypg;

  PostGraduation(String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)
  {
  		super(course,duration,branch,university,yop,name,gender);
  		this.specialization=specialization;
		this.durationpg=durationpg;
		this.yoppg=yoppg;
	 	this.universitypg=universitypg;
  }
  void displayPostGraduation()
  {
  	System.out.println();
  	System.out.println("******** Post Graduation Detail ********");
  	System.out.println("specialization : "+this.specialization);
  	System.out.println("Duration : "+this.durationpg);
  	System.out.println("YOP : "+this.yoppg);
  	System.out.println("university : "+this.universitypg);
  }
}

class Job extends PostGraduation
{
	String company;
	double salary;
	String designation;
	String location;

	Job(String company,double salary,String designation,String location,String specialization,int durationpg,int yoppg,String universitypg,String course,int duration,String branch,String university,int yop,String name,String gender)

	{
		super(specialization,durationpg,yoppg,universitypg,course,duration,branch,university,yop,name,gender);
		this.company=company;
		this.salary=salary;
		this.designation=designation;
		this.location=location;
	}
	void displayJob()
	{
		System.out.println();
		System.out.println("******* Job Detail **********");
		System.out.println("Company : "+this.company);
		System.out.println("Salary : "+this.salary+" LPA");
		System.out.println("designation : "+this.designation);
		System.out.println("location : "+this.location);
	}
}

class HumanDriver
{
	public static void main(String[] args) 
	{
		Job job=new Job("TCS",4,"Asso. System Engineer","Pune","CSE",2,2026,"DBATU","B.tech",4,"CSE","DBATU",2024,"Shivu","Female");
		job.displayHuman();
		job.eat();
		job.walk();
		job.think();
		job.speak();
		job.displayGraduation();
		job.displayPostGraduation();
		job.displayJob();
		
	}
}