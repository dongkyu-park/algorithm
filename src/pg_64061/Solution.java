package pg_64061;

import java.util.ArrayList;

class Solution {

    ArrayList<Integer> arrList = new ArrayList<>();
    int temp = -1;
    int answer = 1;

    public int solution(int[][] board, int[] moves) {

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    arrList.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        int size = arrList.size();
        int afterCrane = crane();

        while (afterCrane != size) {
            size = afterCrane;
            afterCrane = crane();
        }

        return answer;
    }

    public int crane() {
        for (int i = 0; i < arrList.size(); i++) {
            if (temp == arrList.get(i)) {
                temp = -1;
                arrList.remove(i);
                arrList.remove(i - 1);
                answer += 2;
            } else {
                temp = arrList.get(i);
            }
        }

        temp = -1;

        return arrList.size();
    }

}