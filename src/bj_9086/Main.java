package bj_9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String word = sc.next();
            System.out.println(Character.toString(word.charAt(0)) + Character.toString(word.charAt(word.length() - 1)));
        }
    }
}
