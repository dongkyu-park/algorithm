package bj_2789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'C' || word.charAt(i) == 'A' ||
                    word.charAt(i) == 'M' || word.charAt(i) == 'B' ||
                    word.charAt(i) == 'R' || word.charAt(i) == 'I' ||
                    word.charAt(i) == 'D' || word.charAt(i) == 'G' || word.charAt(i) == 'E') {
                continue;
            }
            sb.append(word.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
