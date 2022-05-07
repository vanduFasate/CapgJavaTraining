class Student
{
   private int id;
   private String name;
   Student(int id,String name)
   {  
      this.id=id;
      this.name=name; 
   }
   int getId()
   {
      return id;
   }
   String getName()
   {
      return name;
   }
}

class Mark extends Student
{
   float m1,m2;
   Mark(int id,String name,float m1,float m2)
   {
      super(id,name);
      this.m1=m1;
      this.m2=m2;
   }
   float getM1()
   {
      return m1;
   }
   float getM2()
   {
      return m2;
   }

}
  
class Result extends Mark
{
   Result(int id,String name,float m1,float m2)
   {  
      super(id,name,m1,m2);   
   } 
   void show()
   {
      System.out.println("Id: "+getId());
      System.out.println("Name: "+getName());
      System.out.println("Mark 1: "+m1);
      System.out.println("Mark 2: "+m2);
   }

}
class DemoMultiple
{
   public static void main(String args[])
   {
      Result r;
      r=new Result(5,"Vandu",95,99);
      r.show();
   } 
}