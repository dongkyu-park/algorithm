package bj_2954;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String answer = "";

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' ||
                    line.charAt(i) == 'o' || line.charAt(i) == 'u') {
                answer += line.charAt(i);
                i = i + 2;
            } else {
                answer += line.charAt(i);
            }
        }

        System.out.println(answer);
    }
}
