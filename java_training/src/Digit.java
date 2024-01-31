import java.util.Scanner;

public class Digit {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("enter the number");
        number = sc.nextInt();

        while (number >0){
            System.out.println(number%10);
            number=number/10;

        }
        System.out.println(number);
    }
}
