package hr_time_conversion;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String answer = "";
        String exceptHourAndAbbreviation = s.substring(2 ,s.length() - 2);
        String exceptAbbreviation = s.substring(0 ,s.length() - 2);

        if (s.endsWith("AM")) {
            if (s.startsWith("12")) {
                answer += "00";
                answer += exceptHourAndAbbreviation;
                return answer;
            }
            answer += exceptAbbreviation;
            return answer;
        }

        if (s.startsWith("12")) {
            answer += exceptAbbreviation;
            return answer;
        }
        answer += Integer.parseInt(s.substring(0, 2)) + 12;
        answer += exceptHourAndAbbreviation;
        return answer;
    }
}
