
//                        Sieve of Eratosthenes algorithm
import java.util.*;
public class Primes 
{
    static void primes(int n)
    {
        boolean prime[] = new boolean[n+1];//boolean array with n+1 cells
        //creating an array with all true values froom 2 till n+1
        for(int m=2;m<=n;m++)
        {
            prime[m]=true;
        }
        //travserse from 2 to n/2 and make all the mutliples as false
        for(int i=2;i<=n/2;i++)
        {
            if(prime[i])
            {
                for(int j=i;j*i<=n;j++)
                {
                    prime[j*i]=false;
                }
            }
        }
        //again  run the loop from 2 to n+1 and print all true
        for(int k=2;k<=n;k++)
        {
            if(prime[k])
            {
                System.out.print(k+ " ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        primes(n);
    }
}

//TC:O(n*log(log(n)))
//SC:O(n)