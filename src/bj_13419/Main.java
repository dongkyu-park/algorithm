package bj_13419;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String gameWord = sc.next();
            String hwangyuSay = "";
            String teawookSay = "";

            if (gameWord.length() == 1) {
                hwangyuSay += gameWord;
                teawookSay += gameWord;
                System.out.println(hwangyuSay);
                System.out.println(teawookSay);
                continue;
            }

            for (int j = 0; j < gameWord.length(); j++) {
                if (j % 2 == 0) {
                    hwangyuSay += gameWord.charAt(j);
                    continue;
                }
                teawookSay += gameWord.charAt(j);
            }

            if (gameWord.length() % 2 != 0) {
                String temp = hwangyuSay;
                String temp2 = teawookSay;
                hwangyuSay += temp2;
                teawookSay += temp;
            }

            System.out.println(hwangyuSay);
            System.out.println(teawookSay);
        }
    }
}
