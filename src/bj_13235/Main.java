package bj_13235;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.next();
        boolean flag = true;

        for (int i = 0; i < sentence.length(); i++) {
            if (i == sentence.length() / 2) {
                break;
            }

            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
