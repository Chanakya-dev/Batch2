package Batch2;

import java.util.Scanner;
public class Subhash_if{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.println("entered age"+age);
        
        if(age>=18){
            System.out.println("elgible for vote"+age);
        }
    
        
        else{
            System.out.print(" not elgible for vote");
        }

    }
}
    

