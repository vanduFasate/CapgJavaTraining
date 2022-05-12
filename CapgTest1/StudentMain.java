import java.util.*;
class Student
{
   private String fn,ln,mj;
    private int cy;
    public void setFn(String fn)
    {
        this.fn=fn;
    }
    public void setLn(String ln)
    {
        this.ln=ln;
    }
      public void setMj(String mj)
    {
        this.mj=mj;
    }
      public void setCy(int cy)
      {
         this.cy=cy;
      }
      public String getFn()
      {
         return fn;
      }
       public String getLn()
      {
         return ln;
      }
       public String getMj()
      {
         return mj;
      }
      public int getCy()
      {
         return cy;
      }
      public void stdData()
      {
         System.out.println(" "+fn+" "+ln+" "+mj+" "+cy);
      }

}

public class StudentMain
{
    public static void main(String args[])
     {
       Student st1=new Student();
       st1.setFn("Vandana");
       st1.setLn("Fasate");
       st1.setMj("E&TC");
       st1.setCy(4);
       st1.getFn();
       st1.getLn();
       st1.getMj();
       st1.getCy();
       st1.stdData();
       
       Student st2=new Student();
       st2.setFn("Kalyani");
       st2.setLn("Nalawade");
       st2.setMj("E&TC");
       st2.setCy(4);
       st2.getFn();
       st2.getLn();
       st2.getMj();
       st2.getCy();
       st2.stdData();

     }


}