import java.util.*;
public class functions_methods {
public static void myname(String ch)
{
    System.out.println(ch);
    //return;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ch=sc.nextLine();
        myname(ch); // called the function
    }
}
