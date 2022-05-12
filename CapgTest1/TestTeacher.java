class Person
   {
      String name; 
      String lname;     
      void setName(String name)
      {
         this.name=name;
      }
      void getName()
      {
         System.out.println("Name: "+name);
      }     
      void setLname(String lname)
      {
         this.lname=lname;
      }
      void getLname()
      {
         System.out.println("Last Name: "+lname);
      }

                  
   }
   
class Teacher extends Person
{
   double ansal;
   int srtyr;
   int expnum;
   Teacher(double ansal,int srtyr,int expnum)
   {
   this.ansal=ansal;
   this.srtyr=srtyr;
   this.expnum=expnum;
}
   double getSal()
   {
      return ansal;
    }
    int getYroj()
    {
      return srtyr;
     }  
     int getExpnum()
     {
      return expnum;
      } 
      void showSal()
   {
     System.out.println("Anual Salary: "+ ansal);
    }
    void showYroj()
    {
      System.out.println("Year of joining: "+srtyr);
     }  
     void showExpnum()
     {
      System.out.println("Experience of Teacher: "+expnum);
      } 

}



class TestTeacher
   {
      public static void main(String args[])
      {
      Teacher t=new Teacher(59974.99,5,10);
      t.setName("Ram");
      t.getName();
      t.setLname("Yadav");
      t.getLname();

      t.showSal();
      t.showYroj();
     t.showExpnum();
   
      }
   }
   
   
  