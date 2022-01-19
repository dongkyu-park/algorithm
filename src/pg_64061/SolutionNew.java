package pg_64061;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SolutionNew {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Queue<Integer>> lineHasDoll = new ArrayList<>();
        Stack<Integer> basket = new Stack();

        for (int x = 0; x < board.length; x++) {
            Queue<Integer> dollQueue = new LinkedList();

            for (int y = 0; y < board[x].length; y++) {
                if (board[y][x] != 0) {
                    dollQueue.add(board[y][x]);
                }
            }
            lineHasDoll.add(dollQueue);
        } // O(n^2)

        for (int i = 0; i < moves.length; i++) {
            int x = moves[i] - 1;

            if (lineHasDoll.get(x).isEmpty()) {
                continue;
            }

            int pickUpDoll = lineHasDoll.get(x).poll();

            if (!basket.isEmpty() && basket.peek() == pickUpDoll) {
                basket.pop();
                answer += 2;
                continue;
            }
            basket.push(pickUpDoll);
        } // O(n)

        return answer;
    }
}
