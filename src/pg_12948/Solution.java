package pg_12948;

class Solution {
    public String solution(String phone_number) {

        String temp = phone_number.substring(0, phone_number.length() - 4);
        String hide = "";

        for (int i = 0; i < temp.length(); i++) {
            hide += "*";
        }

        phone_number = phone_number.replace(temp, hide);

        return phone_number;
    }
}