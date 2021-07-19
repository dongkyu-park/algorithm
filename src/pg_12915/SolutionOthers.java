package pg_12915;

import java.util.ArrayList;
import java.util.Collections;

class SolutionOthers {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < strings.length; i++) {
            strings[i] = list.get(i).substring(1);
        }

        return strings;
    }
}