package bj_4597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("#")) {
                break;
            }

            String answer = "";
            int numberOfOne = 0;

            for (int i = 0; i < str.length(); i++) {
                if (i == str.length() - 1) {
                    String lastNumber = validateEvenOdd(str.charAt(i), numberOfOne);
                    answer += lastNumber;
                    break;
                }

                if (str.charAt(i) == '1') {
                    answer += str.charAt(i);
                    numberOfOne++;
                    continue;
                }
                answer += str.charAt(i);
            }
            System.out.println(answer);
        }
    }

    public static String validateEvenOdd(char word, int numberOfOne) {
        if ((word == 'e' && numberOfOne % 2 == 0) || (word == 'o' && numberOfOne % 2 != 0)) {
            return "0";
        }
        return "1";
    }
}
