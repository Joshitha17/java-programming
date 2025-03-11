import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int val=1;
        for(int i=Math.min(x,y);i>=1;i--)
        {
            if(x%i==0 && y%i==0)
            {
                System.out.println("gcd for the given numbers is: "+ i);
                break;
            }
        }
    }
}
