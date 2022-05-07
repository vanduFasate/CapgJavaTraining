import java.util.*;
class Vote
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int age;
String name;
System.out.println("Enter your Name and Age");
name=sc.next();
age=sc.nextInt();
if(age>=18)
{
System.out.println("You can Vote!!!!");
}
else
{
System.out.println("Sorry but you can't Vote");
}}
}