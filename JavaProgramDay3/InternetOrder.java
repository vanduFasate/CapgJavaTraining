import java.util.*;
class InternetOrder
{
public static void main(String arr[])
{
Scanner sc=new Scanner(System.in);
double prc,exp,crg,fn,bill,del;
String nm;
System.out.println("Enter the item: ");
nm=sc.next();
System.out.println("Enter the price of item: ");
prc=sc.nextDouble();
System.out.println("Do you want Express delivery? please type 1 for  yes and 0 for  no: ");
exp=sc.nextDouble();
if(exp==1)
{
crg=3;
}
else
{
crg=0;
}
if(prc<=10)
{
fn=2;
}
else
{
fn=0;
}
del=crg+fn;

bill=prc+crg+fn;
System.out.println("Invoice");
System.out.println(nm+"   "+prc);
System.out.println("delivery"+"   "+del);
System.out.println("Total"+"   "+bill);
}
}
