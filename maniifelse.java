import java.util.Scanner;

public class maniifelse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int i=sc.nextInt();
        if(i%2==0 && i%3==0){
            System.out.println("The number is divisible by 6");
        }
        else if(i%6==0){
            System.out.println("The number is divisible by 6");
        }
        else
        {
            System.out.println("The number is not divisible by 6");
        }

    }
    
}