package grybiena;

import java.util.Random;

public class HomeworkDice {

    public static void main(String[] args) {
        int tries = 1000;
        Random random = new Random();
        int[] dices = new int[6];
        for (int i = 0; i < tries; i++ ) {
            int dice = random.nextInt(6) + 1;
            dices[dice-1]++;
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < dices.length; i++) {
            System.out.println((i+1) + " - " + dices[i] + " times");
            if (dices[i] > max) {
                max = dices[i];
                maxIndex = i+1;
            }
        }
        System.out.println("max - "+ maxIndex);
    }
}
