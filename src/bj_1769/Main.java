package bj_1769;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String X = sc.next();
        int sum = 0;
        int loof = 0;

        if (X.length() < 2) {
            sum = Integer.parseInt(X);

            System.out.println(loof);

            if (sum % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            while (sum == 0 || sum >= 10) {
                sum = 0;

                for (int i = 0; i < X.length(); i++) {
                    sum += Character.getNumericValue(X.charAt(i));
                }

                X = String.valueOf(sum);
                loof++;
            }

            System.out.println(loof);

            if (sum % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
