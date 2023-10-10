import java.util.*;
public class RevStr 
{
    static void reversestring(String str)
    {
        String srev="";
        for(int i=(str.length()-1);i>=0;i--)
        {
            srev=srev+str.charAt(i);
        }
        System.out.println(srev);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String str= sc.nextLine();
        reversestring(str);
    }
}
