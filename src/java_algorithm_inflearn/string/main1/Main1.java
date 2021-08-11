package java_algorithm_inflearn.string.main1;

import java.util.Scanner;

public class Main1 {
    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 일반적인 for문으로 풀이
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }*/

        // 향상된 for문을 적용한 방법
        for(char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
