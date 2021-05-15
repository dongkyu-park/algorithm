package bj_2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 엔터 제거용

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int r = s.charAt(0)-'0';

            for (int j = 2; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(String.valueOf(s.charAt(j)));
                }
            }
            System.out.println();
        }
    }
}
