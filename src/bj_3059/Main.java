package bj_3059;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            boolean[] arr = new boolean[26];
            String S = sc.next();
            int sum = 0;

            for (int j = 0; j < S.length(); j++) {
                int alpha = S.charAt(j) - 65;
                if (!arr[alpha]) {
                    arr[alpha] = true;
                }
            }

            for (int j = 0; j < arr.length; j++) {
                if (!arr[j]) {
                    sum += j + 65;
                }
            }

            System.out.println(sum);
        }
    }
}
