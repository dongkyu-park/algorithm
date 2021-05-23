package bj_2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int minNumber = 2;

        if (n == 1) {
            System.out.println(count);
        } else {
            while (minNumber <= n) {
                minNumber += count * 6;
                count++;
            }
            System.out.println(count);
        }
    }
}
