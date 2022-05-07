import java.util.*;
class Y2k   
   {
      public static void main(String args[])
         {
            Scanner sc=new Scanner(System.in);
            int by,f,l,by1=0,cy1=0;
            int cy,ag,f1,l1;
            
            System.out.println("ENter your Birth year:");
            by=sc.nextInt();
            System.out.println("ENter your Current year:");
            cy=sc.nextInt();
            l=by%10;
            by=by/10;
            f=by%10;
            by1=(by1*10)+f;
            by1=(by1*10)+l;
            
            l1=cy%10;
            cy=cy/10;
            f1=cy%10;
            cy1=(cy1*10)+f1;
            cy1=(cy1*10)+l1;

             System.out.println("Your age:************* "+by1);
             System.out.println("Your age:************* "+cy1);


           
            if(by1>cy1)
               {
                  ag=by1-cy1;
                  System.out.println("Your age: "+ag);
               }
            else
               {
                  ag=cy1-by1;
                  System.out.println("Your age: "+ag);
                }
     }
 }
              
            
