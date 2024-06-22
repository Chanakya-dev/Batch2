import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int i=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of students: ");
        int n=s.nextInt();
        for(;i<n;i++){
            Scanner s1=new Scanner(System.in);
            System.out.println("enter student name:");
            String name=s1.nextLine();
            System.out.println("enter student age: ");
            int age=s1.nextInt();
            System.out.println("enter Student address: ");
            String addr=s1.nextLine();
            System.out.println("name: "+name);
            System.out.println("age: "+age);
            System.out.println("Address: "+addr);
        }
        
    }
    
}
