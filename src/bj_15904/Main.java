package bj_15904;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String completeUCPC = "";
        boolean available = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'U' && completeUCPC.length() == 0) {
                completeUCPC += "U";
            }

            if (word.charAt(i) == 'C' && completeUCPC.length() == 1) {
                completeUCPC += "C";
            }

            if (word.charAt(i) == 'P' && completeUCPC.length() == 2) {
                completeUCPC += "P";
            }

            if (word.charAt(i) == 'C' && completeUCPC.length() == 3) {
                completeUCPC += "C";
            }

            if (completeUCPC.length() == 4) {
                available = true;
                break;
            }
        }

        if (available) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}
