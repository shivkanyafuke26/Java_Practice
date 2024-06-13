/*
class Datatype
{
	String name;
	String type;

	Datatype(String name , String type)
	{
		this.name=name;
		this.type=type;
	}

	void displayDatatype()
	{
		System.out.println("******* Datatype Detail ********");
		System.out.println("Name : "+this.name);
		System.out.println("Type : "+this.type);
	}
}
class IntType extends Datatype
{
	String iType;
	boolean isdefault;
	int range;


	IntType(String iType,boolean isdefault,int range,String name , String type)
	{
		super(name,type);
		this.iType=iType;
		this.isdefault=isdefault;
		this.range=range;
	}
	void displayInt()
	{
		System.out.println("***** Integer Detail *****");
		System.out.println("Type : "+this.iType);
		System.out.println("Is default : "+this.isdefault);
		System.out.println("Range : "+range);
	}

}

class CharType extends Datatype
{
	String cType;
	boolean iscdefault;
	int crange;
	int clength;

	CharType(String cType,boolean iscdefault,int crange,int clength,String name , String type)
	{
		super(name,type);
		this.cType=cType;
		this.iscdefault=iscdefault;
		this.crange=crange;
		this.clength=clength;
	}
	void displayChar()
	{
		System.out.println("***** Character Detail *****");
		System.out.println("Type : "+this.cType);
		System.out.println("Is default : "+this.iscdefault);
		System.out.println("Range : "+this.crange);
		System.out.println("Length : "+this.clength);
	}

}

class BooleanType extends Datatype
{

	String bType;
	boolean isbdefault;

	BooleanType(String bType,boolean isbdefault,String name, String type)
	{
		super(name,type);
		this.bType=bType;
		this.isbdefault=isbdefault;
	}
	void displayBoolean()
	{
		System.out.println("***** Boolean Details *****");
		System.out.println("Type : " +this.bType);
		System.out.println("IS it default : "+this.isbdefault);
	}

}

class DatatypeDriver
{
	public static void main(String[] args) {
		IntType i=new IntType("Integer",true,32767,"int","Number");
		i.displayDatatype();
		i.displayInt();

		CharType c = new CharType("Character",false,6550,1,"char","Character");
		c.displayDatatype();
		c.displayChar();

		BooleanType b=new BooleanType("False",true,"False","Boolean");
		b.displayDatatype();
		b.displayBoolean();
		
	}
}
*/


class Datatype
{
	String name;
	String type;

	Datatype(String name , String type)
	{
		this.name=name;
		this.type=type;
	}

	void displayDatatype()
	{
		System.out.println("******* Datatype Detail ********");
		System.out.println("Name : "+this.name);
		System.out.println("Type : "+this.type);
	}
}
class IntType extends Datatype
{
	String iType;
	boolean isdefault;
	int range;


	IntType(String iType,boolean isdefault,int range,String name , String type)
	{
		super(name,type);
		this.iType=iType;
		this.isdefault=isdefault;
		this.range=range;
	}
	void displayInt()
	{                
		System.out.println("***** Integer Detail *****");
		System.out.println("Type : "+this.iType);
		System.out.println("Is default : "+this.isdefault);
		System.out.println("Range : "+range);
	}

}

class CharType extends Datatype
{
	String cType;
	boolean iscdefault;
	int crange;
	int clength;

	CharType(String cType,boolean iscdefault,int crange,int clength,String name , String type)
	{
		super(name,type);
		this.cType=cType;
		this.iscdefault=iscdefault;
		this.crange=crange;
		this.clength=clength;
	}
	void displayChar()
	{
		System.out.println("***** Character Detail *****");
		System.out.println("Type : "+this.cType);
		System.out.println("Is default : "+this.iscdefault);
		System.out.println("Range : "+this.crange);
		System.out.println("Length : "+this.clength);
	}

}

class BooleanType extmends Datatype
{

	String bType;
	boolean isbdefault;

	BooleanType(String bType,boolean isbdefault,String name, String type)
	{
		super(name,type);
		this.bType=bType;
		this.isbdefault=isbdefault;
	}
	void displayBoolean()
	{
		System.out.println("***** Boolean Details *****");
		System.out.println("Type : " +this.bType);
		System.out.println("IS it default : "+this.isbdefault);
	}

}

class DatatypeDriver
{
	public static void main(String[] args) {
		IntType i=new IntType("Integer",true,32767,"int","Number");
		i.displayDatatype();
		i.displayInt();

		CharType c = new CharType("Character",false,6550,1,"char","Character");
		c.displayDatatype();
		c.displayChar();

		BooleanType b=new BooleanType("False",true,"False","Boolean");
		b.displayDatatype();
		b.displayBoolean();
		
	}
}
