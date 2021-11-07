package bj_2711;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            String[] arr = sc.nextLine().split(" ");

            for (int j = 0; j < arr[1].length(); j++) {
                if (j == Integer.parseInt(arr[0]) - 1) {
                    continue;
                }
                sb.append(arr[1].charAt(j));
            }

            System.out.println(sb.toString());
        }
    }
}
