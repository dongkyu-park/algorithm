package bj_10823;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tempNumber = "";
        int answer = 0;

        while (sc.hasNext()) {
            String line = sc.next();

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ',') {
                    answer += Integer.parseInt(tempNumber);
                    tempNumber = "";
                } else {
                    tempNumber += line.charAt(i);
                }
            }
        }

        answer += Integer.parseInt(tempNumber);
        System.out.println(answer);
    }
}
