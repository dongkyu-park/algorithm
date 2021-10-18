package bj_11656;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String[] arr = new String[S.length()];

        for (int i = 0; i < S.length(); i++) {
            arr[i] = S.substring(i, S.length());
        }

        Arrays.sort(arr);

        for (String word : arr) {
            System.out.println(word);
        }

    }
}
