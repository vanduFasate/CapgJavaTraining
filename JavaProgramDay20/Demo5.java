import java.util.*;
public class Demo5
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[100];
      int i=0;
      String ch;
      do
      {
         System.out.println("EnterNumber:");
         arr[i]=sc.nextInt();
         i++;
         System.out.println("Do you want to Continue?(y/n)");
         ch=sc.next();
         }
         while(ch.equals("y"));
         {
            int x;
            System.out.println("Eneter number to search");
            x=sc.nextInt();
            for( i=0;i<arr.length;i++)
            {
               if(x==arr[i])
               {
                  System.out.println("Found");
                  break;
               }
            }
         }
      }
   }
