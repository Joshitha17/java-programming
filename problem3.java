import java.util.Scanner;

public class problem3 {
    public static int greatest(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("greatest number among given 2 is "+greatest(a, b));
    }
}
