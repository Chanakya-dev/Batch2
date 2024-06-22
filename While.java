package Batch2;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int a=sc.nextInt();
        int i=1;
        while(i<=a){
            if(i%2==0){
                System.out.println("The value of i:"+i);
                
            }
            i++;
        }

        
    }
    
}
