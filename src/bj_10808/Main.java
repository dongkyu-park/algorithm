package bj_10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[26];

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'] += 1;
        }

        for (int answer : arr) {
            System.out.print(answer + " ");
        }
    }
}
