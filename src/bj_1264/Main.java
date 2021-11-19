package bj_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String sentence = sc.nextLine();
            int answer = 0;

            if (sentence.equals("#")) {
                break;
            }

            for (int i = 0; i < sentence.length(); i++) {
                char word = sentence.toLowerCase().charAt(i);

                if (word == 'a' ||
                        word == 'e' ||
                        word == 'i' ||
                        word == 'o' ||
                        word == 'u') {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}
