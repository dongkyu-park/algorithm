package bj_10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        boolean flag = true;

        for (int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {

            if (i == j) {
                break;
            }

            if (word.charAt(i) == word.charAt(j)) {
                if (i + 1 == j) {
                    break;
                } else {
                    continue;
                }
            } else {
                System.out.println(0);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(1);
        }

    }
}
