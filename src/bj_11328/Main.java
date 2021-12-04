package bj_11328;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] arr = sc.nextLine().split(" ");
            Map<Character, Integer> map = new HashMap<>();
            boolean flag = true;

            String word1 = arr[0];
            String word2 = arr[1];

            if (word1.length() != word2.length()) {
                sb.append("Impossible\n");
                continue;
            }

            for (int j = 0; j < word2.length(); j++) {
                if (map.containsKey(word2.charAt(j))) {
                    map.put(word2.charAt(j), map.get(word2.charAt(j)) + 1);
                } else {
                    map.put(word2.charAt(j), 1);
                }
            }

            for (int j = 0; j < word1.length(); j++) {
                if (map.containsKey(word1.charAt(j)) && map.get(word1.charAt(j)) == 1) {
                    map.remove(word1.charAt(j));
                    continue;
                } else if (map.containsKey(word1.charAt(j)) && map.get(word1.charAt(j)) > 1) {
                    map.put(word1.charAt(j), map.get(word1.charAt(j)) - 1);
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("Possible\n");
            } else {
                sb.append("Impossible\n");
            }
        }

        System.out.println(sb.toString());
    }
}
