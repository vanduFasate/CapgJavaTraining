import java.util.*;
class PieEatingCont
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int wt;
      System.out.println("Enter Weight");
      wt=sc.nextInt();
      if(wt>=100 && wt<=250)
      {
         System.out.println("Welcome to the Contest");
      }
      else
      {
         System.out.println("Sorry!!! But you can't go inside");
      }
   }
}