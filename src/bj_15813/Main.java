package bj_15813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        String name = sc.next();
        int score = 0;

        for (int i = 0; i < len; i++) {
            score += name.charAt(i) - 'A' + 1;
        }

        System.out.println(score);
    }
}
