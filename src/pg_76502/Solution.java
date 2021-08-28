package pg_76502;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;

        HashMap<Character, Character> map = new HashMap<Character, Character>() {
            {
                put('(', ')');
                put('{', '}');
                put('[', ']');
            }
        };

        Stack<Character> stack = new Stack<>();
        String temp = "";

        for (int j = 0; j < s.length(); j++) {

            temp = s.substring(0 + j) + s.substring(0, j);
            boolean flag = true;

            for (int i = 0; i < temp.length(); i++) {
                if (map.containsKey(temp.charAt(i))) {
                    stack.push(temp.charAt(i));
                } else {

                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        if (map.get(stack.peek()) == temp.charAt(i)) {
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                    }

                }
            }

            if (flag && stack.size() == 0) {
                answer++;
            }

        }

        return answer;

    }
}