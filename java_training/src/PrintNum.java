import java.util.Scanner;

public class PrintNum {
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int skip;
        System.out.println("enter the number where to skip");
        skip = sc.nextInt();
        int stop;
        System.out.println("enter the number where to stop");
        stop = sc.nextInt();

        int i =1;
        for (i=1; i<=100; i++){
            if (i==skip){
                continue;
            } else if (i==stop) {
                break;
            }
            System.out.println(i);
        }
    }

}
