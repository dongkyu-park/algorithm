package bj_1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int minNumber = 0;
        int count = 1;


        while (minNumber < x) {
            minNumber += count;

            if (minNumber < x) {
                count++;
            }
        }

        int temp = minNumber - x;

        if (count % 2 == 0) {
            System.out.println((count - temp) + "/" + (1 + temp));
        } else {
            System.out.println((1 + temp) + "/" + (count - temp));
        }

    }
}
