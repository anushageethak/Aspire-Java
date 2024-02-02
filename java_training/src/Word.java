import java.util.Scanner;

public class Word {
    public static void main(String[] arg){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=sc.next();

        for (int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

    }
    
}