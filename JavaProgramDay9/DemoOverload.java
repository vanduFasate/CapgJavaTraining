import java.util.*;
class Test
{
   void add(int x,int y)
      {
         System.out.println("Int add");
         System.out.println(x+y);
      }
      void add(float x,float y)
      {
         System.out.println("Float add");
         System.out.println(x+y);
      }
}
class DemoOverload
   {
      public static void main(String args[])
         {
            Test t1=new Test();
            t1.add(9,7);
            t1.add(7.5f,5.7f);
         }
   
   }