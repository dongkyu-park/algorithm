package bj_9498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (90 <= a && a <= 100) {
            System.out.println("A");
            return;
        }
        if (80 <= a && a <= 89) {
            System.out.println("B");
            return;
        }
        if (70 <= a && a <= 79) {
            System.out.println("C");
            return;
        }
        if (60 <= a && a <= 69) {
            System.out.println("D");
            return;
        }
        System.out.println("F");
    }
}
