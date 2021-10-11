package bj_1100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int answer = 0;

        for (int i = 0; i < 8; i++) {
            String str = sc.next();

            if (i % 2 == 0) { // 라인이 짝수라면, 첫번째 칸은 하얀색
                for (int j = 0; j < str.length(); j++) {
                    if (j % 2 == 0) {
                        if (str.charAt(j) == 'F') {
                            answer++;
                        }
                    }
                }
            } else { // 라인이 홀수라면, 첫번째 칸은 검정색
                for (int j = 0; j < str.length(); j++) {
                    if (j % 2 != 0) {
                        if (str.charAt(j) == 'F') {
                            answer++;
                        }
                    }
                }
            }
        }

        System.out.println(answer);

    }
}
