class Test
{
   int i;
   void show()
   {
      System.out.println(i);
   }
}
class Test2
{
   void inr(Test t)
   {
      t.i=t.i+1;
   }
}

class Demo4
   {
      public static void main(String args[])
         {
            Test t1=new Test();
            t1.show();
            Test2=ob=new Test2();
            ob.inr(t1);
            ti.show();
         }
   }
        