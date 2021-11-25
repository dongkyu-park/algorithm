package bj_11944;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        String N = arr[0];
        String M = arr[1];

        String answer = "";

        for (int i = 0; i < Integer.parseInt(N); i++) {
            if (answer.length() < Integer.parseInt(M)) {
                answer += N;
            } else {
                answer = answer.substring(0, Integer.parseInt(M));
                break;
            }
        }

        System.out.println(answer);

    }
}
