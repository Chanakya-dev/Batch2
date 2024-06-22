//program to check on a person's eligibility for voting and Driving License eligibility

import java.util.Scanner;

public class Hemantreddy_ifelse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = sc.nextLine();
        System.out.println("Name: " + name);


        int age = sc.nextInt();
        System.out.println("Age: " + age);


        if (age <= 18) {
            System.out.println("You are aligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        
        
        System.out.println("Do you have a driving license (true/false)?");
        boolean hasLicense = sc.nextBoolean();

        if (age >= 18 && hasLicense) {
            System.out.println("You can drive");
        } else if (age >= 18 && !hasLicense) {
            System.out.println("You need a driving license to drive");
        } else {
            System.out.println("You need to wait till you are 18 and apply for driving license");
        }

    }
}
