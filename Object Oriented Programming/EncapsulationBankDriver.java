class EncapsulationBank{
     private String bankName;
     String branch;
     long accNo;
     String ifscCode;
     private String password; 

  EncapsulationBank(String bankName,String branch,long accNo,String ifscCode,String password)
  {
  	this.bankName = bankName;
  	this.branch = branch;
  	this.accNo = accNo;
  	this.ifscCode = ifscCode;
  	this.password = password;
  }

  public  String getbankName(){
  	return bankName;
  }
  public void setbankName(String newbankName){
  	bankName= newbankName;
  }

  public  String getpassword(){
  	return password;
  }
  public void setpassword(String newpassword){
  	password= newpassword;
  }

  public int display()
  {
  	System.out.println(bankName);
  	System.out.println(branch);
  	System.out.println(accNo);

  	return 0;
  }


}
class EncapsulationBankDriver{
     
  
   public static void main(String[] args) 
   {  
    EncapsulationBank obj = new EncapsulationBank("kotak","nagpur",12333424,"uwuuw","732haq");
    System.out.println(obj.getbankName());
    System.out.println(obj.getpassword());
    System.out.println(obj.display());

     System.out.println();
   }


}