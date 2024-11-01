import java.util.*;
public class factorial {
    // public static int factorialsum(int n){
    //     if(n==1)
    //     {
    //         return 1;
    //     }
    //     else
    //     {
    //         return n*factorialsum(n-1);
    //     }
    // }
    public static void factorialsum(int n){
        int product=1;
        if(n<0)
        {
            System.out.println("invalid number");
            return;
        }
        for(int i=n;i>=1;i--)
        {
            product*=i;
        }
        System.out.println(product);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        factorialsum(n);
    }
}
/*
 * factorial of a number refered to the the number that occure
 * as n*(n-1)*(n-2)........
 * for example factorial of 4
 * 4! = 4*3*2*1 = 24
 */
