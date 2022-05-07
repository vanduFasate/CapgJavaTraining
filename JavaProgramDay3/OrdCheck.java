import java.util.*;
class OrdCheck
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
int nt,blt,wsr,ttl;
System.out.println("Enter Number of nuts: ");
nt=sc.nextInt();
System.out.println("Enter Number of bolts: ");
blt=sc.nextInt();
System.out.println("Enter Number of washer: ");
wsr=sc.nextInt();
System.out.println("Check for order:");
if(nt<=blt)
{
System.out.println(" Too few Nuts");
}
if(wsr<2*blt)
{
System.out.println(" Too few washers");
}
ttl=blt*5+wsr*1+nt*3;
System.out.println("Total cost: "+ttl);
}
}
