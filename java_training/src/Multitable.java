import java.util.Scanner;

public class Multitable {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("enter the number");
        number = sc.nextInt();

        for (int i=1; i<=10; i++){
            int result = i*number;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
