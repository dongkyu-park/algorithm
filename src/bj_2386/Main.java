package bj_2386;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String fullSentence = sc.nextLine();

            if (fullSentence.equals("#")) {
                break;
            }

            String alpha = fullSentence.substring(0, 1);
            String sentence = fullSentence.substring(2, fullSentence.length());
            int quantity = 0;

            for (int i = 0; i < sentence.length(); i++) {
                if ((Character.toString(sentence.charAt(i)).toLowerCase()).equals(alpha)) {
                    quantity++;
                }
            }

            System.out.println(alpha + " " + quantity);
        }
    }
}
