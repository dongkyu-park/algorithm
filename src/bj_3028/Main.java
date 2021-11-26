package bj_3028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shuffle = sc.next();
        String answer = "1";

        for (int i = 0; i < shuffle.length(); i++) {
            if (shuffle.charAt(i) == 'A' && answer.equals("1")) {
                answer = "2";
                continue;
            } else if (shuffle.charAt(i) == 'A' && answer.equals("2")) {
                answer = "1";
                continue;
            }

            if (shuffle.charAt(i) == 'B' && answer.equals("2")) {
                answer = "3";
                continue;
            } else if (shuffle.charAt(i) == 'B' && answer.equals("3")) {
                answer = "2";
                continue;
            }

            if (shuffle.charAt(i) == 'C' && answer.equals("3")) {
                answer = "1";
                continue;
            } else if (shuffle.charAt(i) == 'C' && answer.equals("1")) {
                answer = "3";
                continue;
            }
        }

        System.out.println(answer);

    }
}
