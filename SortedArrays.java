import java.util.*;
public class SortedArrays 
{
    int[] sarray(int arr1[],int n)
    {
        for(int step=1;step<n;step++)
        {
            int key=arr1[step];
            int j=step-1;
            while(j>=0 && key<arr1[j])
            {
                arr1[j+1]=arr1[j];
                --j;
            }
            arr1[j+1]=key;
        }
        return arr1;
    }
    int[] merge(int arr1[],int arr2[],int n,int m,int arr[],int b)
    {
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k++]=arr1[i++];
            }
            else if(arr2[j]<arr1[i])
            {
                arr[k++]=arr2[j++];
            }
            // else
            // {
            //     i++;
            //     j++;
                
            // }
        }
        while(i<n)
        {
            arr[k++]=arr1[i++];
        }
        while(j<m)
        {
            arr[k++]=arr2[j++];
        }
      
        return arr;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++)
        {
             arr2[i]=sc.nextInt();
        }
        SortedArrays sa = new SortedArrays();
        arr1=sa.sarray(arr1,n);
      
        arr2=sa.sarray(arr2,m);
       
        int b=n+m;
        int[]arr= new int[b];
        arr=sa.merge(arr1, arr2,n,m,arr,b);
        for(int i=0;i<b;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
