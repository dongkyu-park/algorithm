package bj_5598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) - 3) < 'A') {
                sb.append((char) ('Z' - Math.abs(word.charAt(i) - 3 - 'A' + 1)));
            } else {
                sb.append((char) (word.charAt(i) - 3));
            }
        }
        System.out.println(sb.toString());
    }
}
