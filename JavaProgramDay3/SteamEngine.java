import java.util.*;
class SteamEngine
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
double eff,tr,tst;
System.out.println("Enter air Tempreture: ");
tr=sc.nextDouble();
System.out.println("Enter steam Tempreture: ");
tst=sc.nextDouble();
if(tst<=373)
{
System.out.println("No Steam.That's why effieciency is 0");
}
else
{
eff=1-tr/tst;
System.out.println("Efficiency is :"+eff);
}
}
}
