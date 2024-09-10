import org.w3c.dom.ls.LSOutput;

public class ArraySortedorNot
{
    static boolean isArraySorted(int a[],int size)
    {
        if(size==1)
        {
            return true;
        }
        else
        {
            return (a[size-1]<a[size-2]) ? false :isArraySorted(a,size-1);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={5,1,8,9};
        int n=arr.length;


        if (isArraySorted(arr, n)) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}