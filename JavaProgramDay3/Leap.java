import java.util.*;
class Leap
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int x;
System.out.println("Enter any year:");
x=sc.nextInt();
if((x%4==0 && x%100==0 )||x%400==0)
{
System.out.println("Leap Year");
}
else 
{
System.out.println("Not Leap Year");
}
}
}





