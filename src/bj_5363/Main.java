package bj_5363;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] arr = sc.nextLine().split(" ");
            String say = "";
            String attachWord = "";

            for (int j = 0; j < arr.length; j++) {
                if (j == 0 || j == 1) {
                    attachWord += arr[j] + " ";
                    continue;
                }
                say += arr[j] + " ";
            }

            say += attachWord;

            System.out.println(say);
        }
    }
}
