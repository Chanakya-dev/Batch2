package Batch2;

import java.util.Scanner;

public class whileloop 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the number :");
       int i=sc.nextInt();

       while(i<5 || i>20)
       {
            System.out.println("The number is not in between 5 and 20");
            i=sc.nextInt();
       }
       System.out.println("The number is between 5 and 20");
    }
}
