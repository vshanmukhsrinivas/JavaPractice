import java.util.*;
class Factors
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        Vector<Integer> v =new Vector<>();
        for(int i=1;i<=Math.sqrt(n);++i)
        {
            if(n%i==0)
            {
                if(i==n/i)
                {
                    System.out.println(i);
                }
                else
                {
                    System.out.println(i);
                }
                if(n/i==i)
                {
                    continue;
                }
                v.add(n/i);
            }
        }
        for(int i=v.size()-1;i>=0;i--)
        {
            System.out.println(v.get(i));
        }
    }
}