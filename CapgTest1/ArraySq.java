import java.util.*;
class ArraySq
{
   public static void main(String args[])
   {
      System.out.println("Enter 5 Elements");
      Scanner sc=new Scanner(System.in);
      int ar[]=new int[5];
      int sq[]=new int[5];
      for(int i=0;i<5;i++)
      {
         ar[i]=sc.nextInt();
      }
      for(int i=0;i<5;i++)
      {
         sq[i]=ar[i]*ar[i];
         
      }
      for(int i=0;i<5;i++)
      {
         System.out.print(" "+sq[i]+" ");
      }
   }
}