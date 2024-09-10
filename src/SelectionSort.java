public class SelectionSort
{
    public static void main(String args[])
    {
        int[] arr={50,5,20,6,100};

        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[smallest])
                {
                    smallest=j;
                }
            }
            temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
