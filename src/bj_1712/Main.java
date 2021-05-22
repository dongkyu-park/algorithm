package bj_1712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        long count = 1;

        if ( ((a + b * count) - (c * count)) <= ((a + b * (count+1)) - (c * (count+1))) ) {
            count = -1;
        } else {
            while ((a + b * count) >= (c * count)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
