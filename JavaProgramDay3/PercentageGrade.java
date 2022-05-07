import java.util.*;
class PercentageGrade
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
double s1,s2,s3,s4,s5,perc,ttl;
System.out.println("Enter Marks of % subject:");
s1=sc.nextDouble();
s2=sc.nextDouble();
s3=sc.nextDouble();
s4=sc.nextDouble();
s5=sc.nextDouble();
ttl=(s1+s2+s3+s4+s5);
System.out.println("Total is:"+ttl);
perc=(ttl/5);
System.out.println("Percentage is:"+perc);
if(perc>=90)
{
System.out.println("Grade A");
}
else if(perc>=80)
{
System.out.println("Grade B");
}
else if(perc>=70)
{
System.out.println("Grade C");
}
else if(perc>=60)
{
System.out.println("Grade D");
}
else if(perc>=40)
{
System.out.println("Grade E");
}
else if(perc<40)
{
System.out.println("Grade E");
}
}
}
