package bj_4458;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();

            char[] arr = word.toCharArray();
            arr[0] = Character.toUpperCase(arr[0]);
            System.out.println(new String(arr));
        }
    }
}
