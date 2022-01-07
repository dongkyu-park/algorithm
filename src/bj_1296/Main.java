package bj_1296;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> map = new HashMap<>();
        String temp =  sc.next();

        for (int i = 0; i < temp.length(); i++) {
            map.put(temp.charAt(i), 0);
        }

        int N = sc.nextInt();
        String winTeamName = "";
        int oddsOfWinning = 0;

        for (int i = 0; i < N; i++) {
            String teamCandidate = sc.next();

            for (int j = 0; j < teamCandidate.length(); j++) {
                if (map.containsKey(teamCandidate.charAt(j))) {
                    map.put(teamCandidate.charAt(j), map.get(teamCandidate.charAt(j) + 1);
                }
            }


        }
    }
}
