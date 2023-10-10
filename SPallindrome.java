import java.util.*;
public class SPallindrome 
{
    static boolean isStringSPallindrome(String str)
    {
        String rstr="";
        for(int i=(str.length()-1);i>=0;i--)
        {
            rstr=rstr+str.charAt(i);
        }
        if(str.toLowerCase().equals(rstr.toLowerCase()))
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); 
        if(isStringSPallindrome(str))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not a Pallindrome");
        }
    }    
}
