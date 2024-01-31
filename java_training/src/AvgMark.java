import java.util.Scanner;

public class AvgMark {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Enter mark");
        a = sc.nextInt();
        System.out.println("Enter mark");
        b = sc.nextInt();
        System.out.println("Enter mark");
       c = sc.nextInt();
        int average = (a + b + c) / 3;
        
        if (average >=70){
            System.out.println("Grade A");
        }else if (average >= 60 && average <= 69 ) {
        System.out.println("Grade B");
        }
    }
}
