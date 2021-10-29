package bj_2744;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String answer = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                answer += Character.toUpperCase(word.charAt(i));
            } else {
                answer += Character.toLowerCase(word.charAt(i));
            }
        }

        System.out.println(answer);
    }
}
