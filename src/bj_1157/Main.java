package bj_1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int[] arr = new int[26];

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) - 'A' >= 32) {
                arr[word.charAt(i) - 97]++;
                continue;
            }
            arr[word.charAt(i) - 65]++;
        }

        int max = -1;
        char print = '?';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                print = (char)(i + 65);
                continue;
            }
            if (arr[i] == max) {
                print = '?';
            }
        }

        System.out.println(print);
    }
}
