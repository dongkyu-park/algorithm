package bj_11575;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String[] arr = sc.nextLine().split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            String X = sc.nextLine();
            String answer = "";

            for (int j = 0; j < X.length(); j++) {
                sb.append(affineCipher(a, b, X.charAt(j) - 'A'));
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static Character affineCipher(int a, int b, int X) {
        return (char) ('A' + ((a * X + b) % 26));
    }
}
