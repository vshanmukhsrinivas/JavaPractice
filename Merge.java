import java.util.*;
public class Merge  
{
    static void merge(int[] arr1,int[] arr2)
    {
        
        int n3=arr1.length + arr2.length;
        int[] arr3 = new int[n3];
        for(int i=0;i<arr1.length;i++)
        {
            arr3[i]=arr1[i];
        }
         for(int j=0;j<arr2.length;j++)
        {
            arr3[arr1.length+j]=arr2[j];
        }
        for(int k=0;k<n3;k++)
        {
            System.out.print(arr3[k]+ " ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2 = new int[n2];
         for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        merge(arr1,arr2);
    }
}
