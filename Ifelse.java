import java.util.Scanner;




public class Ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age:");
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("eligible");
        }
        else if(age>=12&&age<18){
            System.out.println("uneligible");
        }
        else{
            System.out.println("not valid");
        
        }
    }
}



    

