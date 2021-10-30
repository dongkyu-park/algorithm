package bj_11365;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        while (!word.equals("END")) {
            StringBuilder sb = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }

            System.out.println(sb.toString());
            word = sc.nextLine();
        }

    }
}
