import java.util.Scanner;

public class problem1 {
    public static int average(int a,int b,int c)
    {
        int n=(a+b+c)/3;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("average of given 3 numbers is " + average(a,b,c));
    }
}
