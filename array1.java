//basically its a linear search

import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks= new int[n];
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }
        int search=4;
        for(int i=0;i<n;i++)
        {
            if(marks[i]==search)
            {
                System.out.println("element found at index " + i);
            }
        }
    }
}
