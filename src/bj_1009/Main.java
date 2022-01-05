package bj_1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String[] arr = sc.nextLine().split(" ");
            long a = Long.parseLong(arr[0]);
            long b = Long.parseLong(arr[1]);

            long power = getPower(a, b);
            if (power == 0) {
                System.out.println("10");
            } else {
                System.out.println(power);
            }
        }
    }

    public static long getPower(long a, long b) {
        long temp;

        if (b == 0) {
            return 1;
        }

        if (b % 2 == 0) {
            temp = getPower(a, b / 2);
            return temp * temp % 10;
        }

        temp = getPower(a, (b - 1) / 2);
        return temp * temp * a % 10;
    }
}
