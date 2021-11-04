package bj_1543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();

        int checkWordIdx = 0;
        int answer = 0;

        int docIndex = 0;

        for (int i = docIndex; i < doc.length(); i++) {
            if (doc.charAt(i) == word.charAt(checkWordIdx)) { // doc의 i번째 글자와, 주어진 word가 동일한 경우
                if (checkWordIdx == word.length() - 1) { // doc의 문자가 주어진 word와 정확히 일치하는 경우
                    answer++;
                    checkWordIdx = 0; // word의 순서를 0으로 초기화
                    docIndex = i; // docIndex값을 해당 i번째로 이동
                } else { // 아직 정확히 일치하지 않는 경우, word의 다음 순서 문자로 이동
                    checkWordIdx++;
                }
            } else { // doc의 i번째 글자와, 주어진 word가 일치하지 않는 경우, for문의 i를 저장된 index로 초기화
                if (checkWordIdx != 0) {
                    checkWordIdx = 0; // word의 순서를 0으로 초기화,
                    i = docIndex++; // docIndex값을 +1
                }
            }
        }

        System.out.println(answer);

    }
}
