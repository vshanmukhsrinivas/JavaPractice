import java.util.*;
public class factTrailingZeros {
    static int  zeros(long f)
    {
        int count=0;
        while(f%10==0)
        {
            count++;
            f=f/10;
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         long f=1;
        for(int i=1;i<n+1;i++)
        {
            f=f*i;
        }
        System.out.println(zeros(f));
        
    }
}
