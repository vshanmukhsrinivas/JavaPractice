import java.util.*;
public class camilCase 
{
    static void intoCamilCase(String str)
    {
            char[] ch=str.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]==' ')
                {
                    System.out.println();
                }
                else if(Character.isLowerCase(ch[i]))
                {
                    System.out.print(ch[i]=Character.toUpperCase(ch[i]));
                }
                else if(Character.isUpperCase(ch[i]))
                {
                    System.out.print(ch[i]=Character.toLowerCase(ch[i]));
                }
                
            }
        
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        intoCamilCase(str);
    }
}
