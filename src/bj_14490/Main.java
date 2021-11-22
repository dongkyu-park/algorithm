package bj_14490;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.next();
        String[] arr = numbers.split(":");

        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int gcd = GCD(n, m);

        System.out.println(n / gcd + ":" + m / gcd);
    }

    public static int GCD(int n, int m) {
        if (m == 0) {
            return n;
        }

        return GCD(m, n % m);
    }
}
