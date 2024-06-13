class OperatingSystem{

	String osName;
    int osVersion;
    String architecture;
    String manufacturer;
    int numberOfProcesses;
    
    Kernel kernel=new Kernel("Linux", 5, "x86_64", "Open Source", "CFS");
   

	OperatingSystem(String osName,int osVersion,String architecture,String manufacturer,int numberOfProcesses)
    {
		this.osName=osName;
		this.osVersion=osVersion;
		this.architecture=architecture;
		this.manufacturer=manufacturer;
		this.numberOfProcesses=numberOfProcesses;
		this.kernel=kernel;
	}

	public void displayOperatingSystem(){
		System.out.println("------ Operating System ----------");
		System.out.println("Os Name : " +osName);
		System.out.println("os Version : "+osVersion);
		System.out.println("architecture : "+architecture);
		System.out.println("manufacturer : "+manufacturer);
		System.out.println("no. of Processes : "+numberOfProcesses);
		
	}

} 
class Kernel{

	String kernelName;
    int kernelVersion;
    String architecture;
    String manufacturer;
    String schedulingAlgorithm;
   
	Kernel(String kernelName,int kernelVersion,String architecture,String manufacturer,String schedulingAlgorithm){
 		this.kernelName = kernelName;
 		this.kernelVersion= kernelVersion;
 		this.architecture = architecture;
 		this.manufacturer = manufacturer;
 		this.schedulingAlgorithm = schedulingAlgorithm;
 	
	}
	
	public void displayKernel(){
		System.out.println("----------- Kernel Configuration -------------");
		System.out.println("Kernel Name : "+kernelName);
		System.out.println("kernel Version : "+kernelVersion);
		System.out.println("architecture : "+architecture);
		System.out.println("manufacturer : "+manufacturer);
		System.out.println("scheduling Algorithm : "+schedulingAlgorithm);
h n
	}
}

class HasARelationship1
{
	public static void main(String[] args) {

		OperatingSystem obj = new OperatingSystem("Windows", 10, "x86_64", "Microsoft", 200);
		obj.displayOperatingSystem();
		obj.kernel.displayKernel();
	}

}