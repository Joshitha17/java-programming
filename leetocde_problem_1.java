import java.util.*;
public class leetocde_problem_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int search =sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == search)
                {
                    System.out.print("[" + i + "," + j + "]"+" ");
                }
            }
        }

        //System.out.println("No pair found.");
    }
}
