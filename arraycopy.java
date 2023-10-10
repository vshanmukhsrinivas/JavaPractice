import java.util.*;
public class arraycopy 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2= new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int res=arr1.length+arr2.length;
        int[] merg= new int[res];
        System.arraycopy(arr1,0,merg,0,n);
        System.arraycopy(arr2,0,merg,n,m);
        System.out.println(Arrays.toString(merg));
    }
}
