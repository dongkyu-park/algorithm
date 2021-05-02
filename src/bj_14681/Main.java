package bj_14681;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
            return;
        }
        if (x < 0 && y > 0) {
            System.out.println("2");
            return;
        }
        if (x < 0 && y < 0) {
            System.out.println("3");
            return;
        }
        System.out.println("4");
    }
}
