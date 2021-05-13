package bj_10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
            for (int j = 0; j < s.length(); j++) {
                if (arr[s.charAt(j) - 'a'] == -1) {
                    arr[s.charAt(j) - 'a'] = j;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
