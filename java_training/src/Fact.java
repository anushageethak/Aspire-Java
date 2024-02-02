import java.util.Scanner;

public class Fact {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int fact=1;
        for (int i=1; i<=number; i++){
            fact *= i;
        }
        System.out.println("factorial is " +fact);



    }
}
