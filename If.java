package Batch2;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=scanner.nextInt();

        if(age>=20){
            System.out.println("You can ride the rollercoster");
            System.out.println(" Your ticket price is 200/-");
        }
        else if(age<=15&&age>=10){
            System.out.println("You can ride the rollercoster");
            System.out.println("Your ticket price is 150/-");

        }
        else if(age<=10&&age>5){
            System.out.println("You can ride the rollercoster");
            System.out.println("Your ticket price is 100/-");
        }
        else if(age==5){
            System.out.println("You can ride the rollercoster");
            System.out.println("Your ticket price is 50/-");
        } 
        else {
            System.err.println("You cant ride the rolercoster");
            System.out.println("But your entry ticket is free");
        }
}
}

