package bj_10769;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine();
        int sad = 0;
        int happy = 0;

        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ':') {
                i += 1;
                continue;
            }

            if (words.charAt(i) == '(') {
                sad++;
                continue;
            }

            if (words.charAt(i) == ')') {
                happy++;
                continue;
            }
        }

        if ((happy == sad) && happy != 0 && sad != 0) {
            System.out.println("unsure");
        } else if (happy > sad) {
            System.out.println("happy");
        } else if (sad > happy) {
            System.out.println("sad");
        } else {
            System.out.println("none");
        }
    }
}
