package bj_2884;

import java.util.Scanner;

public class Main {

    public static final int MINUTE = 45;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            System.out.print(h);
            System.out.print(" ");
            System.out.print(m - MINUTE);
            return;
        }
        if (m <= 45) {
            if (h > 0) {
                System.out.print(h - 1);
            }
            if (h == 0) {
                System.out.print("23");
            }
            System.out.print(" ");
            System.out.print(60 + (m - MINUTE));
        }
    }
}
