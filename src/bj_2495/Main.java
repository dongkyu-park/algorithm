package bj_2495;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String word = sc.next();
            int max = 1;
            int consecutiveNumber = 1;

            for (int i = 0; i < 7; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    consecutiveNumber++;

                    if (max < consecutiveNumber) {
                        max = consecutiveNumber;
                    }
                } else {
                    consecutiveNumber = 1;
                }
            }

            System.out.println(max);
        }
    }
}
