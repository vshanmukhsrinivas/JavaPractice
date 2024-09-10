public class Recursion
{
    public static void  printFibanocci(int n,int first,int secound)
    {
        if(n<1)
        {
            return;
        }
        int fib=first+secound;
        System.out.print(fib + " ");
        printFibanocci(n-1,secound,fib);
    }
    public static void main(String args[])
    {
        System.out.print("0 1 ");
        printFibanocci(5,0,1);
    }
}
