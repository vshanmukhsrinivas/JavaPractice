import java.util.*;
public class Duplicates 
{
    
    static void noDuplicates(String str)
    {
        String temp=str;
        String emp="";
        String nospace=temp.replaceAll("\\s", "");
       
         System.out.println(nospace);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        noDuplicates(str);
    }
}
