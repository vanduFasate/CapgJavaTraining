import java.util.*;
class LastChance
{
   public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         int tnk,grd,ml;
         int gslft=0;
         int mlslft=0;
         System.out.println("Tank Capacity");
         tnk=sc.nextInt();
         System.out.println("Gage reading");
         grd=sc.nextInt();
         System.out.println("Miles per Gallon");
         ml=sc.nextInt();
         gslft=(tnk*grd)/100;
         mlslft=gslft*ml;
         if(mlslft<200)
         {
            System.out.println("Get gas!!!!");
         }
         else
         {
            System.out.println("Safe to proceed!!!!");

          }
       }
} 
         
         
         