class MyInfo{

	private String name,nplace,branch;

	MyInfo(String name, String nplace, String branch)
	{
		this.name= name;
		this.nplace=nplace;				//setters dont have return type
		this.branch=branch;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String updateName)
	{
		name=updateName;
	}
	public String getNplace()
	{
		return nplace;
	}
	public void setNplace(String updateNplace)
	{
		nplace=updateNplace;
	}

	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String updateBranch)
	{
		branch=updateBranch;
	}
	
}

class EncapsulationExample{
	public static void main(String[] args) {
		MyInfo obj=new MyInfo("shivu","pune","cse");
		System.out.println(obj.getName());
		obj.setName("shivani");
		System.out.println(obj.getName());
		System.out.println(obj.getNplace());
		System.out.println(obj.getBranch());
	}
}