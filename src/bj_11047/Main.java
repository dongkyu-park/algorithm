package bj_11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int change = K;
        int answer = 0;

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            if (change >= arr[i]) {
                answer += change / arr[i];
                change %= arr[i];
            }
        }

        System.out.println(answer);
    }
}
