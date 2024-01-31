import java.util.Scanner;

public class SumNumber {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("enter the number");
        number = sc.nextInt();

        int sum = 0;
        for (int i = number; i >= 1; i--) {
            sum += i;
        }

        System.out.printf("Sum of numbers from %d to 1 is: %d%n", number, sum);


    }
}
