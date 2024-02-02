public class PatternPrinting {

    public static void main(String[] arg) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        //number pyramid
        int rows = 4;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
//    //        triangle pattern
////        int row = 5;
//        for (int i = 1; i <= row; i++) {
//        for (int j = 1; j <= row - i; j++) {
//            System.out.print("  ");
//        }
//        for (int k = 1; k <= i; k++) {
//            System.out.print("* ");
//        }
//
//        System.out.println();
//    }


}
