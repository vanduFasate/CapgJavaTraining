import java.util.*;
class FantasyGame
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int st,h,lk,pt;
String nm;
System.out.println("Welcome to Yertel's Quest");
System.out.println("Enter your Character:");
nm=sc.next();
System.out.println("Enter Strength(1-10):");
st=sc.nextInt();
System.out.println("Enter Health(1-10):");
h=sc.nextInt();
System.out.println("Enter Luck(1-10):");
lk=sc.nextInt();
pt=st+h+lk;
if(pt>=15)
{
st=5;
h=5;
lk=5;
System.out.println(nm+" Strength: "+st+" Health: "+h+" Luck: "+lk);
}
if(pt<15)
{
System.out.println(nm+" Strength: "+st+" Health: "+h+" Luck: "+lk);
}
}
}


