
import java.util.Scanner;
public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        int[] arr= {50,5,20,6,100};
        int temp;
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=arr.length-i-1;j>0;j--)
            {
                if(arr[j]>arr[j-1])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
