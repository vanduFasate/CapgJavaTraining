/*A HighSchool application has two classes: the Person superclass and the Student subclass. Using 
inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. A Teacher 
will be like Person but will have additional properties such as salary (the amount the teacher 
earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”). The 
CollegeStudent class will extend the Student class by adding a year (current level in college) and 
major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).*/



class Person
{
   String add,name;
   Person(String add,String name)
   {
      this.add=add;
      this.name=name;
   }
   String getAdd()
   {
      return add;
   }
    String getName()
   {
      return name;
   }
}

class Student extends Person
{
   int sid;
   float perc;
   Student(String add,String name,int sid,float perc)
   {
      super(add,name);
      this.sid=sid;
      this.perc=perc;
   }
   int getSid()
   {
      return sid;
   }
   float getPerc()
   {
      return perc;
   }


}

class Teacher extends Person
{
   float sal;
   String sub;
   int tid;
   Teacher(String add,String name,float sal,String sub,int tid)
   {
      super(add,name);
      this.sal=sal;
      this.sub=sub;
      this.tid=tid;
   }
   float getSal()
   {
      return sal;
   }
   String getSub()
   {
      return sub;
   }
   int getTid()
   {
      return tid;
   }
   void showTeacherInfo()
   {
      System.out.println("*******************************");
      System.out.println("College Teacher Info");
      System.out.println("name is: "+getName());
      System.out.println("std ID: "+getTid());
      System.out.println("Major is: "+getSal());
      System.out.println("Year is: "+getSub());
      System.out.println("Address is : "+getAdd());
      System.out.println("*******************************");
 
   }
}

class CollegeStd extends Student
{
   int year;
   String major;
   CollegeStd(String add,String name,int sid,float perc,int year,String major)
   {
      super(add,name,sid,perc);
      this.year=year;
      this.major=major;
   }
      int getYear()
   {
      return year;
   }
   String getMajor()
   {
      return major;
   }
   void showclgstd()
   {  
      System.out.println("*******************************");
      System.out.println("College student Info");
      System.out.println("name is: "+getName());
      System.out.println("std ID: "+getSid());
      System.out.println("Major is: "+getMajor());
      System.out.println("Year is: "+getYear());
      System.out.println("Percentage is: "+getPerc());
      System.out.println("Address is : "+getAdd());
      System.out.println("*******************************");

    }
}

public class DemoHybrid
{
   public static void main(String args[])
   {
      CollegeStd c1=new CollegeStd("AUrangabad","Vandu",45208,94.0f,4,"E&TC");
      c1.showclgstd();
      Teacher t1=new Teacher("Paithan"," Ram",7598.9f,"Python",7957);
      t1.showTeacherInfo();
   }


}