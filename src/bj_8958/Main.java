package bj_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (String temp : arr) {
            int score = 0;
            int result = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == 'O') {
                    score++;
                    result += score;
                    continue;
                }
                score = 0;
            }
            System.out.println(result);
        }
    }
}
