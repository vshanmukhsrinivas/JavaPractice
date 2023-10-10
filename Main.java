import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int o=0;int t=n-1;
        for(int i=0;i<n;)
        {
            if(i>t)
            {
                break;
            }
            if(arr[i]==0)
            {
                arr[i]=1;
                arr[o]=0;
                o++;
                i++;
            }
            else if(arr[i]==2)
            {
                arr[i]=arr[t];
                arr[t]=2;
                t--;
            }
                else if(arr[i]==1)
            {
                i++;
            }

        }
          for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}