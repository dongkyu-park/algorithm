package pg_17682;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        int index = 0;

        int[] arr = new int[3];

        for (int i = 0; i < dartResult.length(); i++) {
            char check = dartResult.charAt(i);

            if (check >= '0' && check <= '9') {
                if (check == '1') {
                    // 숫자가 10인경우 체크
                    if (dartResult.charAt(i + 1) == '0') {
                        arr[index] = 10;
                        index++;
                        i++; // 다음 숫자인 0체크는 제외해주기 위해 
                        continue;
                    }
                    // 아니라면, 1입력
                    arr[index] = 1;
                    index++;
                } else {
                    arr[index] = check - '0';
                    index++;
                }
            }

            if (check == 'S') {

            }

            if (check == 'D') {
                arr[index - 1] = (int)Math.pow(arr[index - 1], 2);
            }

            if (check == 'T') {
                arr[index - 1] = (int)Math.pow(arr[index - 1], 3);
            }

            if (check == '*') {
                if (index > 1) {
                    arr[index - 2] =  arr[index - 2] * 2;
                    arr[index - 1] =  arr[index - 1] * 2;
                } else {
                    arr[index - 1] =  arr[index - 1] * 2;
                }
            }

            if (check == '#') {
                arr[index - 1] =  arr[index - 1] * (-1);
            }
        }

        answer = arr[0] + arr[1] + arr[2];

        return answer;
    }
}