import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] arg)
    {
        Scanner sc =new Scanner(System.in);
        int age;
        String name;
        System.out.println("enter the name");
        name = sc.next();
        System.out.println("enter the age");
        age = sc.nextInt();
        System.out.println("hello ");

        sc.close();
    }
}
