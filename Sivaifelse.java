import java.util.*;
public class Sivaifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int  age = scanner.nextInt();
        if (age<18){
            System.out.println("your are not eligible for vote");
        }
        else if(age>=18){
            System.out.println("your are  eligible for vote");
        }
        else{
            System.out.println("you have a time to vote");
        }


        
        
    }
    
}
