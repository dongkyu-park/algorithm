package bj_2577;

import java.util.Scanner;

public class MainOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multi = a * b * c;
        int[] arr = new int[10];

        while (multi > 0) {
            arr[multi % 10]++;
            multi /= 10;
        }

        for (int result : arr) {
            System.out.println(result);
        }
    }
}
