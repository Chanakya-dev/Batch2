
import java.util.Scanner;

public class Sivafor{
    public static void main(String[] args) {
        
        try (Scanner loop = new Scanner (System.in)) {
            System.out.println("enter a number");
            int  number = loop.nextInt();
        }
        for(int i=0;i<=10;i++) {
            System.out.println("your given number = " + i);
        }
    }
}