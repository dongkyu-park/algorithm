package bj_2810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String line = sc.next();
        int cupHolder = 1;

        for (int i = 0; i < N; i++) {
            if (line.charAt(i) == 'S') {
                cupHolder++;
            } else if (line.charAt(i) == 'L') {
                cupHolder++;
                i++;
            }
        }

        if (cupHolder > N) {
            System.out.println(N);
        } else {
            System.out.println(cupHolder);
        }
    }
}
