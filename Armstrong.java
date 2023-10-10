import java.util.*;
public class Armstrong 
{
    static int size;
    static  boolean isArmstrong(int n)
    {
        
        int temp=n;
        int rem=0,x=0;
        while(temp!=0)
        {
            rem=temp%10;
            x=x+(int)Math.pow(rem,size);
            temp/=10;
        }
        if(n==x)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int n=sc.nextInt();
        if(isArmstrong(n))
        {
            System.out.println("Armstrorng number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
