class SingltoneClass
{
   String name;
   String branch;
   private static SingltoneClass obj;

   SingltoneClass(String name,String branch)
   {
      this.name=name;
      this.branch=branch;
   }

   public static SingltoneClass getInstance(String name,String branch)
   {
      if(obj==null)
      {
         obj=new SingltoneClass(name,branch);
         return obj;
      }
      else
      {
         return obj;
      }
   }

   public static void main(String[] args) 
   {
      SingltoneClass obj1=getInstance("abcd","CSE") ; 
      System.out.println(obj1.name);

      SingltoneClass obj2=getInstance("ABCD","Electrical") ; 
      System.out.println(obj2.name);

      SingltoneClass obj3=getInstance("A1B2C3","Civil") ; 
      System.out.println(obj3.name);

      SingltoneClass obj4=getInstance("A2B2C2","Mechanical") ; 
      System.out.println(obj4.name);
   }
}