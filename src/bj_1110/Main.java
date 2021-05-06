package bj_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int initNumber = n;
        int roof = 0;

        while (true) {
            roof++;
            int next = n / 10 + n % 10;
            n = n % 10 * 10 + next % 10;
            if (initNumber == n) {
                System.out.println(roof);
                break;
            }
        }
    }
}