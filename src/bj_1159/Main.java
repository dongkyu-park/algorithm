package bj_1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26];
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String player = sc.next();
            arr[player.charAt(0) - 'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                sb.append((char) (i + 'a'));
            }
        }

        if (sb.length() == 0) {
            sb.append("PREDAJA");
        }

        System.out.println(sb.toString());

    }
}
