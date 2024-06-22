//program to check on a person's eligibility for voting and Driving License eligibility

//scanner class got imported post declaring the scanner object
import java.util.Scanner;

public class Hemant_ifelse {
    
    public static void main(String[] args) { //Entry point of the program
        
        Scanner sc = new Scanner(System.in); //declaring scanner object for it to be able to read inputs from console

        //take user's console input for name
        System.out.println("Enter your name: ");

        //scanner reads name value and prints output
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        //take user's console input for age
        System.out.println("Enter your age: ");

        //scanner reads age value and prints output
        int age = sc.nextInt();
        System.out.println("Age: " + age);

        //control flow for determining user's voting eligibility
        if (age <= 18) {
            System.out.println("You are aligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        
        //having the scanner read the user's console input to check if they have a license or not
        System.out.println("Do you have a driving license (true/false)?");
        boolean hasLicense = sc.nextBoolean();

        //control flow to determine the user's driving license eligibility
        if (age >= 18 && hasLicense) {
            System.out.println("You can drive");
        } else if (age >= 18 && !hasLicense) {
            System.out.println("You need a driving license to drive");
        } else {
            System.out.println("You need to wait till you are 18 and apply for driving license");
        }

    }
}
