package pg_12915;

class Solution {
    public String[] solution(String[] strings, int n) {

        String temp = "";

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j].charAt(n) < strings[i].charAt(n)) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }

                if (strings[j].charAt(n) == strings[i].charAt(n)) {
                    int num = strings[i].compareTo(strings[j]);
                    if (num >= 0) {
                        temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }
        return strings;
    }
}