package bj_4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {

            int[] arr = new int[sc.nextInt()];
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            int count = 0;
            int average = sum / arr.length;

            for (int k = 0; k < arr.length; k++) {
                if (arr[k] > average) {
                    count++;
                }
            }

            double result = (double)count / arr.length;
            System.out.printf("%.3f%%\n",(result)*100);
        }

    }
}
