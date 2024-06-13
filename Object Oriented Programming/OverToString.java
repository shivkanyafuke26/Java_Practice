import java.util.*;
class StudentToString
{
   String name;
   String branch;
   String place;

   StudentToString(String name,String branch,String place)
   {
      this.name=name;
      this.branch=branch;
      this.place=place;
   }
   @Override
   public String toString()
   {
      return "hii my name is "+this.name+" and i belong to "+this.place+" and I from "+this.branch+" branch";
   }

}
class OverToString
{
   public static void main(String[] args) {
   StudentToString obj1=new StudentToString("Ramesh","pune","mechanical");
   System.out.println(obj1);
}
}