import java.util.*;
public class Swapping 
{
    static void Swap(int x,int y)
    {
        System.out.println("X=" + x + " Y=" + y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("X=" + x + " Y=" + y);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Swap(x,y);
    }
}
