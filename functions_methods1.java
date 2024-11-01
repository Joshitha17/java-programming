import java.util.*;
public class functions_methods1 {
    public static int sum(int a,int b)
    {
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sum(a,b);
        System.out.println("sum of a and b is "+c);
        //System.out.printf("sum of %d and %d is %d%n",a,b,c);
    }
}
