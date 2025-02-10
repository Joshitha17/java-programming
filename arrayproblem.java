import java.util.Scanner;

public class arrayproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String [] names = new String[n];
        for(int i=0;i<n;i++)
        {
            names[i]=sc.nextLine();
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(names[j]);
        }
    }
}
