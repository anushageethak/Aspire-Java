import java.util.Scanner;

public class Fact {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("enter the number");
        number = sc.nextInt();


        for (int i = number; i >= 1; i--) {
            number *= i;
        }

        System.out.printf("Sum of numbers from %d to 1 is:", number);


    }
}
