class Employee
{
   String name;
   String dept;

   Employee(String name,String dept)
   {
      this.name=name;
      this.dept=name;
   }

  /* public void m1()
   {
      System.out.println("Name "+name);
      System.out.println("Dept "+dept);
   }*/

   @Override
   protected void finalize() throws Throwable
   {
      try{
      System.out.println("Hello from Employee class");
   }
   finally{
      super.finalize();
   }
}
   public static void main(String[] args)throws Throwable
    {     
      Employee obj=new Employee("Ramesh","working");
      obj=null;
      System.gc();
      System.out.println(obj.name);
   } 
}