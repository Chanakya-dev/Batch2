package Batch2;

import java.util.Scanner;


public class pavanifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in );
        System.out.println("enter  the age  ");
        int age = in .nextInt() ;
        if (age<=0 && age<18  ){
            System.out.println("children");
        }
        else if ( age>=18 && age <30 )
         { 
            System.out.println(" adult ");
        }
        else {
            System.out.println(" old age  ");
        }

    }
    
}
