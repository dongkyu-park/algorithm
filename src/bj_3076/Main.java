package bj_3076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] RCarr = sc.nextLine().split(" ");
        String[] ABarr = sc.nextLine().split(" ");

        int R = Integer.parseInt(RCarr[0]);
        int C = Integer.parseInt(RCarr[1]);
        int A = Integer.parseInt(ABarr[0]);
        int B = Integer.parseInt(ABarr[1]);

        for (int i = 0; i < R; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < A; j++) {
                    for (int k = 0; k < C; k++) {
                        if (k % 2 == 0) {
                            for (int l = 0; l < B; l++) {
                                System.out.print("X");
                            }
                        } else {
                            for (int l = 0; l < B; l++) {
                                System.out.print(".");
                            }
                        }
                    }
                    System.out.println();
                }
            } else {
                for (int j = 0; j < A; j++) {
                    for (int k = 0; k < C; k++) {
                        if (k % 2 == 0) {
                            for (int l = 0; l < B; l++) {
                                System.out.print(".");
                            }
                        } else {
                            for (int l = 0; l < B; l++) {
                                System.out.print("X");
                            }
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
