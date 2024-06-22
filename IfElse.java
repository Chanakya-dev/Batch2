
import java.util.*;
public class IfElse 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //finding greatest of 3 numbers 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
        System.out.println(a+ " a is grater" );
        else if(b>a && b>c)
        System.out.println(b+ " b is grater" );
        else
        System.out.println(c+ " c is grater" );

    }
}
