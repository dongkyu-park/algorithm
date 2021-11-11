package bj_5218;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String x = sc.next();
            String y = sc.next();
            StringBuilder sb = new StringBuilder("Distances: ");

            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) <= y.charAt(j)) {
                    sb.append((y.charAt(j) - x.charAt(j)) + " ");
                } else {
                    sb.append((y.charAt(j) + 26) - x.charAt(j) + " ");
                }
            }

            System.out.println(sb.toString());

        }
    }
}
