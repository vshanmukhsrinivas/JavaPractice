import java.util.*;
public class FirstandLastsum 
{
    static void fnlsum(int n)
    {
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        int l=arr.length;
        for(int i=0;i<l/2;i++)
        {
            int sum=0;
            sum=arr[i]+arr[l-1-i];
            System.out.println(arr[i] + "+" + arr[l-1-i] + "="+ sum);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fnlsum(n);
    }
}
