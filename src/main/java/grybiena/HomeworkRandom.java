package grybiena;

import java.util.Scanner;

public class HomeworkRandom {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk skaiciu:");
        int sk = sc.nextInt();
        System.out.println("tu ivedei:");
        System.out.println(sk);


        int[][] m = {
                {1, 2, 3},
                {4, 5, 6, 8, 4},
                {7, 8, 9}
        };

        for (int i = 0; i < m.length; i++) {
//            int[] eilute = m[i];
//            for (int j = 0; j < eilute.length; j++) {
            for (int j = 0; j < m[i].length; j++) {
//                int reiksme = eilute[j];
                int reiksme = m[i][j];
                System.out.print(reiksme);
                System.out.print('\t');
            }
            System.out.println();
        }



//        double [] cups = new double [10];
//        boolean isNotFull = true;
//        int result = -1;
//
//        while (isNotFull) {
//            for (int i = 0; i < cups.length; i++) {
//                cups[i] += Math.random();
//                System.out.println(cups[i] + " - " + i);
//
//                if (cups[i] >= 1 ) {
//                    isNotFull = false;
//                    result = i;
//                    break;
//                }
//            }
//        }
//        System.out.println(result);
    }
}

