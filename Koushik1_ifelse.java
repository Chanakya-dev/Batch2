import java.util.Scanner;
import java.util.*;
public class Koushik1_ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if (price >= 15000) {
            System.out.println("Can buy product");
        }
        else if(price < 15000) {
            System.out.println("Cannot buy product");

        }
        else {
            System.out.println("Cannot afford the product");
        }
    }

}