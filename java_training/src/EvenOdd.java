import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter Number");
        a = sc.nextInt();
        if (a%2 == 0){
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Not Even Number");
        }

    }
}
