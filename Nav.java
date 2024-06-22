package Batch2;
import java.util.Scanner;

public class Nav {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int i= scan.nextInt();
        if (i>20) {
            System.out.println("Elgible for license ");

        }
        else{
            System.err.println("NOt elgible for license");
        }

        
    }
    
}
