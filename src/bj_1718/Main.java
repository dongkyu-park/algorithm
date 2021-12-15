package bj_1718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String secretKey = sc.next();
        int secretOrder = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (secretOrder >= secretKey.length()) {
                secretOrder = 0;
            }
            
            if (sentence.charAt(i) == ' ') {
                sb.append(" ");
                secretOrder++;
                continue;
            }

            if (sentence.charAt(i) <= secretKey.charAt(secretOrder)) {
                int distance = secretKey.charAt(secretOrder) - sentence.charAt(i);
                sb.append((char) ('z' - distance));
            } else {
                int alphaOrder = secretKey.charAt(secretOrder) - 'a' + 1;
                sb.append((char) (sentence.charAt(i) - alphaOrder));
            }

            secretOrder++;
        }
        System.out.println(sb.toString());
    }
}
