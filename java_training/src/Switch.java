import java.util.Scanner;

public class Switch {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int week;
        System.out.println("Enter week");
        week = sc.nextInt();
        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day number.");
                break;
        }
    }
}
