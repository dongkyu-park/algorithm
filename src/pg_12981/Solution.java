package pg_12981;

import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        String[] aa = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int a = 3;

        System.out.println(solution(a,aa));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        boolean continueGame = true;
        int loof = 0;

        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String> tempList = new ArrayList<>();
        for(String temp : words) {
            wordsList.add(temp);
        }

        // 끝 낱말과 첫 낱말이 일치하지 않으면 리턴
        for (int i=0; i < wordsList.size()-1; i++) {
            if(!wordsList.get(i).substring(wordsList.get(i).length()-1).equals(wordsList.get(i+1).substring(0,1))) {
                answer[0] = (i+1)%n;
                answer[1] = (int) Math.floor((i+1)/n);
                return answer;
            }
        }

        while(continueGame) {

            System.out.println("loof 값 : " + loof);

            for (int j = 0; j < n; j++) {

                if (tempList.contains(wordsList.get(j + (n * loof)))) {
                    System.out.println("체킹1");
                    answer[0] = j+1;
                    answer[1] = loof;
                    continueGame = false;
                }

                tempList.add(j + (n * loof), wordsList.get(j + (n * loof)));

                if (j + (n * loof) == wordsList.size()) {
                    System.out.println("체킹");
                    continueGame = false;
                }
            }

            loof++;

        }

        return answer;
    }
}