class University
{
	String name;
	String uniCode;
	int noOfCollege;
	String type;
	int establishedYear;
	int courses;
	College college;
	
	University(String name,String uniCode,int noOfCollege,String type,int establishedYear,int courses)
	{
		this.name=name;
		this.uniCode=uniCode;
		this.noOfCollege=noOfCollege;
		this.type=type;
		this.establishedYear=establishedYear;
		this.courses=courses;
	}

	public void displayUniversity()
	{
		System.out.println("********university detail *****");
		System.out.println("Name of university: "+name);
		System.out.println("Unicode : "+uniCode);
		System.out.println("No of Colleges : "+noOfCollege);
		System.out.println("Type : "+type);
		System.out.println("Established Year : "+establishedYear);
		System.out.println("Courses : "+courses);
	}
	public void createInstanceofCollege(String name,int collegeCode,String address, String noOfDepartment, char grade,int staffCount)
	{
		college=new College(name,collegeCode,noOfDepartment,grade,staffCount);
	}
}

class College
{
	String name;
	int collegeCode;
	String address;
	int noOfDepartment;
	char grade;
	int staffCount;
	Department department;
	College(String name,int collegeCode,String address, String noOfDepartment, char grade,int staffCount)
	{
		this.name=name;
		this.collegeCode=collegeCode;
		this.address=address;
		this.noOfDepartment=noOfDepartment;
		this.grade=grade;
		this.staffCount=staffCount;		
	}
	public void displayCollege()
	{	
		System.out.println("********College detail *****");
		System.out.println("Name: "+name);
		System.out.println("college code : "+collegeCode);
		System.out.println("Address : "+address);
		System.out.println("No of department : "+noOfDepartment);
		System.out.println("Grade : "+grade);
		System.out.println("staff Count : "+staffCount);
	}
	public void createInstanceofDepartment()
	{
		department=new Department();
	}
}

class Department
{
	String name;
	String hod;
	int classRoom;
	int subject;
	int staff;
	Teacher teacher;	
	
	Department(String name,String hod, int classRoom,int staff,int subject)
	{
		this.name= name;
		this.hod=hod;
		this.classRoom=classRoom;
		this.staff=staff;
		this.subject=subject;

	}

	public void displayDepartment()
	{
		System.out.println("********Department detail *****");
		System.out.println("Name: "+name);
		System.out.println("HOD : "+hod);
		System.out.println("Class Rooms: "+classRoom);
		System.out.println("staff  : "+staff);
		System.out.println("Subject: "+subject);
	
	}
	public void createInstanceofTeacher()
	{
		teacher=new Teacher();
	}
}
class Teacher
{
	String name;
	String subjet;
	long phoneNumber;
	String qualification;
	double experience;
	
	Teacher(String name,String subject,long phoneNumber,String qualification,double experience)
	{
	this.name=name;
	this.subject=subject;
	this.phoneNumber=phoneNumber;
	this.qualification=qualification;
	this.experience=experience;
	}
	public void displayTeacher()
	{
		System.out.println("********Teacher detail *****");
		System.out.println("Name: "+name);
		System.out.println("HOD : "+subject);
		System.out.println("Class Rooms: "+phoneNumber);
		System.out.println("staff  : "+qualification);
		System.out.println("Subject: "+experience);
	
	}
}
class AggregationDriver{
	public static void main(String[] args){
	University obj=new University("Dbatu","2138",10,"private",2003,10);  //String name,String uniCode,int noOfCollege,String type,int establishedYear,int courses
	obj.displayUniversity();
	obj.createInstanceofCollege("mss",2138,"jalna","8",'A',16); //String name,int collegeCode,String address, String noOfDepartment, char grade,int staffCount
	obj.college.displayCollege();
	obj.college.createInstanceofDepartment();
	obj.college.department.displayDepartment();
	obj.college.department.createInstanceofTeacher();
	obj.college.department.teacher.displayTeacher();

	}

}