import java.util.Scanner;
import java.lang.*;
public class arrayproblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] number = new int[n];
        for(int i=0;i<n;i++)
        {
            number[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if (number[i] > max) {
                max = number[i];  // Update max if current number is greater
            }
            if (number[i] < min) {
                min = number[i];  // Update min if current number is smaller
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
