import java.io.*;
import java.util.*;
class fibo
{
  int a,b,c,n;
  Scanner sc=new Scanner(System.in);
  void fn()
  {
     System.out.println("Enter a number:");
     n=sc.nextInt();
     a=0;
     b=1;
     if(n==0)
         System.out.print("The number is fibonacci");
     else
     {
     c=a+b;
    
     while(c<n)
     {
        a=b;
        b=c;
        c=a+b;
     }
     if(c!=n)
       System.out.println("The number is not fibonacci");
     else
       System.out.println("The number is fibonacci");
     }
   }
}
class fibonacci
{
  public static void main(String args[])
  {
    fibo obj=new fibo();
    obj.fn();
  }
}
     

   