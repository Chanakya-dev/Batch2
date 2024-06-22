package Batch2;

import java.util.Scanner;

public class forloop 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        int i=sc.nextInt();

        System.out.println("The numbers are :");
        for(;i<40;i++)
        {
            if(i%2==0)
            System.out.println(i);
        }
    }
    
}
