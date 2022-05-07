import java.util.*;
class Britian
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   int ld;
   int crg=0;
   int ttl;
   System.out.println("Please enter weight of Trash");
   ld=sc.nextInt();
   if(ld>=200)
   {
      crg=20;

      ttl=ld-200;
      if(ttl>=100)
      {
        crg=10;
      }
      
   }
   System.out.println("Total Charges :"+crg);
   }
 }