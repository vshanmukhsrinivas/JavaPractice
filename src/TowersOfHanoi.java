public class TowersOfHanoi
{
    static void towersOfHanoi(int d,char src,char dest, char aux)
    {
        if(d==0 || d==1)
       return ;
        else
        {
            towersOfHanoi(d-1,src,dest,aux);
            System.out.println("Move disk " + d + " from rod "
                    + src + " to rod "
                    + dest);
            towersOfHanoi(d-1,aux,src,dest);
        }
    }
    public static void main(String args[])
    {

        int disks=3;
        towersOfHanoi(disks,'A','B','C');
    }
}
