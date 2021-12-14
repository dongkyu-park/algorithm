package bj_5789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String nums = sc.next();

            if (nums.charAt(nums.length() / 2 - 1) == nums.charAt(nums.length() / 2)) {
                System.out.println("Do-it");
            } else {
                System.out.println("Do-it-Not");
            }
        }
    }
}
