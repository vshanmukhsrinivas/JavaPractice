import java.sql.SQLOutput;
import java.util.Scanner;
public class TwoDArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column count of the 2D matrix:");

        int row=sc.nextInt();
        int column=sc.nextInt();

        int[][] arr= new int[row][column];

        System.out.println("Enter the elements of "+ row +"x" + column + " matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    //Spiral Order of a matrix

        int rowStart=0;
        int rowEnd=row-1;
        int columnStart=0;
        int columnEnd=column-1;

        while(rowStart<=rowEnd && columnStart<=columnEnd)
        {
            for(int i=columnStart;i<=columnEnd;i++)
            {
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++)
            {
                System.out.print(arr[i][rowEnd] + " ");
            }
            columnEnd--;

            for(int i=columnEnd;i>=columnStart;i--)
            {
                System.out.print(arr[rowEnd][i] + " ");
            }
            rowEnd--;

            for(int i=rowEnd;i>=rowStart;i--)
            {
                System.out.print(arr[i][columnStart] + " ");
            }
            columnStart++;

        }

    }
}
