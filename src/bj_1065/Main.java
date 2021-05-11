package bj_1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (check(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check(int n) {
        int firstDiffer = (n % 10) - ((n / 10) % 10);
        while (n > 0) {
            if (n / 10 != 0) {
                if (firstDiffer != (n % 10) - ((n / 10) % 10)) {
                    return false;
                }
            }
            n /= 10;
        }
        return true;
    }
}
