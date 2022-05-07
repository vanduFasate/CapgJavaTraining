import java.util.*;
class ProfitLoss
{
public static void main (String arr[])
{
Scanner sc=new Scanner(System.in);
double selamt,pamt,prft,lss;
System.out.println("Enter Purchase amount");
pamt=sc.nextDouble();
System.out.println("Enter selling amount");
selamt=sc.nextDouble();
if(pamt>=selamt)
{
lss=pamt-selamt;
System.out.println("You have loss of " +lss);
}
else
{
prft=selamt-pamt;
System.out.println("You have Profit of "+prft);
}
}
}

