package bj_12605;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String sentence = sc.nextLine();

            String[] arr = sentence.split(" ");
            String reverseWord = "Case #" + (i + 1) + ": ";

            for (int j = arr.length - 1; j >= 0; j--) {
                reverseWord += arr[j] + " ";
            }

            System.out.println(reverseWord);
        }
    }
}
