//import java.util.Scanner;
// public class practice{
//     public static void main (String [] args)
//     {
//         //Scanner sc=new Scanner(System.in);
//         int n=4;
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=n-i;j>=1;j--)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             for(int j=2;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

public class practice{
    public static void main(String[] args) {
        int n=4;
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}