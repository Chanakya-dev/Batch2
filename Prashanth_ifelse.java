import java.util.*;
public class Prashanth_ifelse {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int  age = sc.nextInt();
        if(age <18){
            System.out.println("Minnor");
        }
        else if (age > 18 || age == 18 && age < 60){
            System.out.println("major");
        }
        else{
             System.out.println("Senior citizens");
        }
    
    }
    
}
