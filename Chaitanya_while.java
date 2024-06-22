import java.util.Scanner;
public class Chaitanya_while {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        n = input.nextInt();
        int i=1;
        while(i<=n){
            if (i%2!=0){
                System.out.println(i);
            }    
            i++;
        }
    }
}
