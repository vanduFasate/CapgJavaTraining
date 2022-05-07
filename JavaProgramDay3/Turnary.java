import java.util.*;
class Turnary
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int x,y,max;
System.out.println("Enter two number:");
x=sc.nextInt();
y=sc.nextInt();
max=x>y?x:y;
System.out.println("Max number is: "+max);
}
}
