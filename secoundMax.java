import java.util.*;
public class secoundMax 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int fm=Integer.MIN_VALUE;
        int sm=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>fm)
            {
                sm=fm;
                fm=arr[i];
            }
            else if(arr[i]>sm && arr[i]<fm)
            {
                sm=arr[i];
            }
        }
        
        System.out.println(sm);
    }
}   
