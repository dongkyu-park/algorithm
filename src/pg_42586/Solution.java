package pg_42586;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Stack<Integer> proStack = new Stack<>();
        Stack<Integer> timeStack = new Stack<>();

        for (int i = progresses.length - 1; i >= 0; i--) {
            proStack.push(progresses[i]);
        }

        for (int i = progresses.length - 1; i >= 0; i--) {
            timeStack.push(speeds[i]);
        }

        String tempAnswer = "";

        while (!proStack.isEmpty()) {

            int count = 0;

            for (int i = 0; i < proStack.size(); i++) {
                proStack.set(i, proStack.get(i) + timeStack.get(i));
            }

            while (!proStack.isEmpty() && proStack.peek() >= 100) {
                proStack.pop();
                timeStack.pop();
                count++;
            }

            if (count != 0) {
                tempAnswer += String.valueOf(count) + " ";
            }

        }

        return Arrays.stream(tempAnswer.trim().split(" ")).mapToInt(Integer::parseInt).toArray();

    }
}