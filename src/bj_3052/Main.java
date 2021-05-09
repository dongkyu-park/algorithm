package bj_3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        Arrays.sort(arr);
        double m = arr[n-1];

        double average = ((sum / m * 100) / n);
        System.out.println(average);
    }
}
