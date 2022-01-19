package pg_12930;

import java.util.Arrays;
import java.util.List;

public class SplitLimitTest {
    public static void main(String[] args) throws Exception {
        List<String> test_list = Arrays.asList(",,,try,hello,,test,,,".split(","));

        for (String test_str : test_list) {
            System.out.println("[" + test_str + "]");
        }

        System.out.println("-----------------------------------------");

        List<String> test_list2 = Arrays.asList(",,,try,hello,,test,,,".split(",",-1));

        for (String test_str2 : test_list2) {
            System.out.println("[" + test_str2 + "]");
        }
    }
}
