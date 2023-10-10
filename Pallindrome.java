import java.util.*;
public class Pallindrome 
{
    static int n;
   static  boolean isPallindrome(int n)
    {
        int ntemp=n;
        int nrev=0;
        int rem=0;
        while(ntemp!=0)
        {
            rem=ntemp%10;
            nrev=nrev*10+rem;
            ntemp/=10;
        }
        if(nrev==n)
        {   
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
         
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        try
        {
             n=sc.nextInt();
             if(isPallindrome(n))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not a Pallindrome");
        }
        }
        catch(InputMismatchException ie)
        {
            System.out.println("enter numerical value only!!\nError:"+ie);
            
        }
        
        
    }
}
