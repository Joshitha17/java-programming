import java.util.*;
public class array2d_problem {
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int search=4;
        int [][] arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]==search)
                {
                    System.out.println("element found at position "+i+" "+j);
                }
            }
            System.out.println();
        }
    }
}
