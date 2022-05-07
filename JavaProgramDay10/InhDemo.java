class Animal
{
   void sleep()
   {
      System.out.println("This is sleep()  from class Animal");
   }
   void eat()
   {
      System.out.println("This is eat()  from class Animal");
   }

}

class Bird extends Animal
{
   void fly()
   {
      System.out.println("This is fly()  from class Animal");
   }
   void sleep()
   {
      System.out.println("This is Overridden sleep()  from class Bird");
   }
   void eat()
   {
      System.out.println("This is Overridden  eat()  from class  Bird");
   }


}

class InhDemo
{
   public static void main(String args[])
   {
      Bird b1=new Bird();
      b1.sleep();
      b1.fly();
      b1.eat();
      Animal a1=new Animal();
      a1.sleep();
      a1.eat();
   }
}