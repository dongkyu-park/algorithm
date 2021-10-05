package bj_10953;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String numbers = sc.next();
            int first = Character.getNumericValue(numbers.charAt(0));
            int second = Character.getNumericValue(numbers.charAt(2));

            sb.append(first + second).append("\n");
        }

        System.out.println(sb.toString());
    }
}
