package bj_2153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int sum = 0;
        boolean flag = true;

        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);

            if (temp >= 'a' && temp <= 'z') {
                sum += word.charAt(i) - 'a' + 1;
                continue;
            }

            if (temp >= 'A' && temp <= 'Z') {
                sum += word.charAt(i) - 'A' + 27;
                continue;
            }
        }

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
    }
}
