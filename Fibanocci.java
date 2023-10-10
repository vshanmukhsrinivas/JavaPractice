import java.util.*;
public class Fibanocci 
{
    static  void isFibanocci(int n)
    {
        int prevprev=0;
        int prev=1;
        int curr=0;
        if(n==1)
        {
            System.out.println("0");
             
        }
        if(n==2)
        {
            System.out.println("0 1");
        }
        if(n>2)
        {
            System.out.print("0 1 ");
            for(int i=2;i<n;i++)
            {
                curr=prevprev+prev;
                System.out.print(curr+ " ");
                prevprev=prev;
                prev=curr;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isFibanocci(n);
    }
}
