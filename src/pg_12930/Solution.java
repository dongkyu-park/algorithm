package pg_12930;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = new String[s.length()];
        arr = s.split(" ", -1);

        for (int i = 0; i < arr.length; i++) {

            char[] charArr = arr[i].toCharArray();

            for (int j = 0; j < charArr.length; j++) {
                if(j % 2 == 0) {
                    charArr[j] = Character.toUpperCase(charArr[j]);
                } else {
                    charArr[j] = Character.toLowerCase(charArr[j]);
                }
            }

            if (i != arr.length - 1) {
                answer += new String(charArr) + " ";
            } else {
                answer += new String(charArr);
            }

        }

        return answer;
    }

    public static void main(String[] args) {

            String answer = "";
            String s = " try hello world ";

            String[] arr = new String[s.length()];
            arr = s.split(" ", -1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

            for (int i = 0; i < arr.length; i++) {

                char[] charArr = arr[i].toCharArray();

                for (int j = 0; j < charArr.length; j++) {
                    if(j % 2 == 0) {
                        charArr[j] = Character.toUpperCase(charArr[j]);
                    } else {
                        charArr[j] = Character.toLowerCase(charArr[j]);
                    }
                }

                if (i != arr.length - 1) {
                    answer += new String(charArr) + " ";
                } else {
                    answer += new String(charArr);
                }

            }

        System.out.println(answer);
    }
}