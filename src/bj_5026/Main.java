package bj_5026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String[] arr = sc.next().split("\\+");

            if (arr[0].equals("P=NP")) {
                System.out.println("skipped");
                continue;
            }

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            System.out.println(a + b);
        }
    }
}
