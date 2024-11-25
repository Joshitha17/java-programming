import java.util.Scanner;

public class practice {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int element=3;
        int [] arrays = new int [n];
        for(int i=0;i<n;i++)
        {
            arrays[i]=sc.nextInt();

        }
        for(int i=0;i<arrays.length;i++)
        {
            if(arrays[i]==element)
            {
                System.out.println("element found at index"+i);
            }
        }

    }
}
