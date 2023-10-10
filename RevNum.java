import java.util.*;
public class RevNum 
{
    static void reverseanumber(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+(n%10);
            n/=10;
        }
        System.out.println(rev);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        reverseanumber(n);
    }
}
