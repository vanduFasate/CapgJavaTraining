
class Armstrong
{
   public  static void main(String arr[])
   {
      int num=0,temp,dig=0,end=0,sum,n;
      System.out.println("Armstrong Numbers in Range 100 to 999 are:");
      end=999;
      int i=100;
      while(i<=end)
         {
            num=i;
            sum=0;
            while(num>0)
            {
               dig=num%10;
               sum=sum+(dig*dig*dig);
               num=num/10;
            }
            if(sum==i)
            {
               System.out.print(sum+" ");
            }
            i++;
         }
   }
}

