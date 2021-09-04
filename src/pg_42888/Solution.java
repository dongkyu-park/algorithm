package pg_42888;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {

        ArrayList<String> arrList = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] tempRecord = record[i].split(" ");

            if (tempRecord[0].equals("Enter")) {
                map.put(tempRecord[1], tempRecord[2]);
                arrList.add(tempRecord[1] + "님이 들어왔습니다.");
            } else if (tempRecord[0].equals("Leave")) {
                arrList.add(tempRecord[1] + "님이 나갔습니다.");
            } else if (tempRecord[0].equals("Change")) {
                map.put(tempRecord[1], tempRecord[2]);
            }
        }

        String[] answer = new String[arrList.size()];
        int idx = 0;

        for (String val : arrList) {
            String[] temp = val.split("님");
            String uid = temp[0];

            answer[idx] = val.replace(uid, map.get(uid));
            idx++;
        }

        return answer;
    }
}