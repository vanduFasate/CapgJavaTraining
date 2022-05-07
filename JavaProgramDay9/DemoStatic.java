class Test
{
   int i;
   static int j;
   Test()
   {
     i=i+1;
     j=j+1;
   }
   void display()
   {
      System.out.println("Hello");
   }
   static void show()
   {
      System.out.println(j);
      Test ob2=new Test();
      ob2.display();
   }
}

class DemoStatic
   {
      public static void main(String args[])
         {
            Test t1=new Test();
           
            Test.show();
         }
   }
        