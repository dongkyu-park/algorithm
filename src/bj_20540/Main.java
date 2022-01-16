package bj_20540;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> mbtiMap = new HashMap<>();

        mbtiMap.put('E', 'I');
        mbtiMap.put('I', 'E');
        mbtiMap.put('S', 'N');
        mbtiMap.put('N', 'S');
        mbtiMap.put('T', 'F');
        mbtiMap.put('F', 'T');
        mbtiMap.put('J', 'P');
        mbtiMap.put('P', 'J');

        String myMbti = sc.next();
        String idealType = "";

        for (int i = 0; i < myMbti.length(); i++) {
            idealType += mbtiMap.get(myMbti.charAt(i));
        }

        System.out.println(idealType);
    }
}
