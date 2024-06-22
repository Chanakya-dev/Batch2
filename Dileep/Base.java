import java.util.Scanner;

class Base
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        if (age>=18)
        {
            System.out.println("you are eligible for the vote");
        }
        else if(age<18)
        {
            System.out.println("you are not eligible for the voting wait for the age of 18");

        }
        else
        {
            System.out.println("enter a valid value");
        }
    }
}