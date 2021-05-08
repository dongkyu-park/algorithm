package bj_2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multi = a * b * c;
        int multiLength = (int)(Math.log10(multi)+1);
        int[] arr = new int[multiLength];
        int temp = 0;
        int index = 0;
        int count = 0;

        while (multi > 0) {
            temp = multi % 10;
            arr[index] = temp;
            index++;
            multi /= 10;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
