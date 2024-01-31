import java.util.Scanner;

public class AgeFind {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter Age");
        age = sc.nextInt();
        if (age >= 40 && age <= 55) {
            System.out.println("Younger");
        } else if (age > 55) {
            System.out.println("Older");
        }
        else {
            System.out.println("kid");
        }
    }
}
