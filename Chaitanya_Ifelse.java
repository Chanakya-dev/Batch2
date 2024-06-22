
import java.util.Scanner;

public class Chaitanya_Ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attendence;
        System.out.print("Enter your attendence : ");
        attendence = input.nextInt();
        if (attendence >= 75) {
            System.out.println("You need not to pay fine");
        }
        else if (attendence >= 60){
            System.out.println("You need to pay fine of Rs. 100");
        }
        else{
            System.out.println("You need to pay fine of Rs. 500");
        }

    }
}
