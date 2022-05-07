class Person
   {
      String name;      
      void setName(String name)
      {
         this.name=name;
      }
      void getName()
      {
         System.out.println("Name: "+name);
      }
                  
   }
   
class Employee extends Person
{
   double ansal;
   int srtyr;
   String insnum;
   Employee(double ansal,int srtyr,String insnum)
   {
   this.ansal=ansal;
   this.srtyr=srtyr;
   this.insnum=insnum;
}
   double getSal()
   {
      return ansal;
    }
    int getYroj()
    {
      return srtyr;
     }  
     String getInsnum()
     {
      return insnum;
      } 
      void showSal()
   {
     System.out.println("Anual Salary: "+ ansal);
    }
    void showYroj()
    {
      System.out.println("Year of joining: "+srtyr);
     }  
     void showInsnum()
     {
      System.out.println("Insurance Number: "+insnum);
      } 

}



class TestEmployee
   {
      public static void main(String args[])
      {
      Employee em=new Employee(5974.99,5,"Abc579");
      em.setName("Ram");
      em.getName();
      em.showSal();
      em.showYroj();
      em.showInsnum();
   
      }
   }
   
   
  