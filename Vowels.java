import java.util.*;
public class Vowels 
{
    static void vowels(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||  str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||  str.charAt(i)=='O' || str.charAt(i)=='U'  )
            {
                continue;
            }
            else
            {
                System.out.println("At index:" + i + "-"+str.charAt(i) + " ");
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        vowels(str);
    }
}
