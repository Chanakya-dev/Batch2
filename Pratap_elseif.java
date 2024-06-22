package Batch2;

import java.util.Scanner;

public class Pratap_elseif {
    public static void main(String[] args) {
       
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("enter your credit score");
        int credit=sc.nextInt();
        if (age>=18&&credit>=200)
        System.out.println(" you are Credible for loan");
        else if(age>=18&&credit<200)
        System.out.println(" you are Not credible for loan");
        else
        System.out.println("your age is under 18, you are Not credible for loan");

    }
    
}
