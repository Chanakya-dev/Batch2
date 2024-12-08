package Batch2;
import java.util.Scanner;

public class Subhash1_ifelse {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string:");
    String name=sc.nextLine();
    if(name.charAt(0)+name.charAt(1)==name.charAt(2)+name.charAt(3)){
        System.out.println("lucky");
    }
    else{
        System.out.println("non lucky");
    }
    }
}