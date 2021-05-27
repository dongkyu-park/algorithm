package bj_2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 3;
        int b = 5;

        int result = 0;
        int count = 0;

        if (n % 5 == 0) {
            result = n / 5;
        }

        if (n % 3 == 0) {
            result = n / 3;
        }

        while (n > 0) {
            if (n % 5 % 3 == 0) {
                result = (n / 5) + (n % 5 / 3) + count;
                break;
            }

            n -= 3;
            count++;
        }

        if (result == 0) {
            result = -1;
        }

        System.out.println(result);

    }
}
