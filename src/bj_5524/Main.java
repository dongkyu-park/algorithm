package bj_5524;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            System.out.println(name.toLowerCase());
        }
    }
}
