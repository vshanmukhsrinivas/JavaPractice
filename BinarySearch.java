public class BinarySearch
{
    private static int binarySearch(int[] arr,int target)
    {
        int low=0;
        int high = arr.length -1;
        int mid=(low+high)/2;
        while(low<=high)
        {
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]<target)
            {
                mid=mid+1;
            }
            if(arr[mid]>target) 
            {
                mid=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int[] arr= {1,2,3,5,9,10};
        System.out.println(binarySearch(arr, 9));
    }
}