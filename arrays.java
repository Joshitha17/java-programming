import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        //for input
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }
        //for output
        for(int i=0;i<n;i++)
        {
            System.out.print(marks[i]+" ");
        }
    }
}
