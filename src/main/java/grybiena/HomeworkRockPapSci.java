package grybiena;

import java.util.Random;
import java.util.Scanner;

public class HomeworkRockPapSci {

    public static void main(String[] args) {
        int tries = 1000;
        aiVsAi(tries);
        humanVsAi();
    }
    public static void aiVsAi(int tries) {
        Random random = new Random();
        int firstWins = 0;
        int secondWins = 0;
        for (int i=0; i<tries; i++) {
            int firstRps = random.nextInt(3) + 1;
            int secondRps = random.nextInt(3) + 1;

            if (firstRps != secondRps) {
                if (firstPlayerWin(firstRps, secondRps)) {
                    firstWins++;
                } else {
                    secondWins++;
                }
            }
        }
        System.out.println("first wins: " + firstWins);
        System.out.println("second wins: " + secondWins);
        System.out.println("draw games: " + (tries-secondWins-firstWins));
        System.out.println();
    }
    public static void humanVsAi() {
        Random random = new Random();
        int humanWins = 0;
        int aiWins = 0;
        Scanner scanner = new Scanner (System.in);
        boolean continuePlay = true;
        while (continuePlay) {
            System.out.println("Enter your number (1-rock, 2-paper, 3-scissors): ");
            int firstRps = scanner.nextInt();
            int secondRps = random.nextInt(3) + 1;
            System.out.println("AI has " + printSelection(secondRps));
            if (firstRps != secondRps) {
                if (firstPlayerWin(firstRps, secondRps)) {
                    System.out.println("You've won!");
                    humanWins++;
                } else {
                    System.out.println("AI wins.");
                    aiWins++;
                }
            }
            System.out.println("Play again? (1=yes, 2=no)");
            int playAgain = scanner.nextInt();
            if (playAgain != 1) {
                continuePlay = false;
            }
        }
    }

    public static boolean firstPlayerWin(int firstRps, int secondRps) {
        if (firstRps == 1) {
            if (secondRps == 2) {
                return false;
            } else {
                return true;
            }
        } else if (firstRps == 2) {
            if (secondRps == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            if (secondRps == 1) {
                return false;
            } else {
                return true;
            }
        }
    }

    private static String printSelection(int rps) {
        if (rps == 1) {
            return "1 - rock";
        } else if (rps == 2) {
            return "2 - paper";
        } else {
            return "3 - scissors";
        }
    }


}
