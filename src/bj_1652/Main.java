package bj_1652;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Character[][] arr = new Character[N][N];

        int horizontal = 0;
        int vertical = 0;

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            int check_hori = 0;
            int check_verti = 0;

            for (int j = 0; j < N; j++) {
                // 가로 1줄씩 진행하며 체크한다.
                if (arr[i][j] == '.') {
                    check_hori++;
                }

                if (arr[i][j] == 'X' || (j == N - 1)) { // 문자 X를 만나거나, 마지막 위치일 때
                    if (check_hori >= 2) {
                        horizontal++;
                    }
                    check_hori = 0;
                }

                // 세로 1줄씩 진행하며 체크한다.
                if (arr[j][i] == '.') {
                    check_verti++;
                }

                if (arr[j][i] == 'X' || (j == N - 1)) { // 문자 X를 만나거나, 마지막 위치일 때
                    if (check_verti >= 2) {
                        vertical++;
                    }
                    check_verti = 0;
                }
            }
        }

        System.out.println(horizontal + " " + vertical);

    }
}
