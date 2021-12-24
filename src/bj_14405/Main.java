package bj_14405;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String say = sc.next();
        boolean available = true;

        for (int i = 0; i < say.length(); i++) {
            if (say.charAt(i) == 'p') {
                if (i + 2 > say.length() || say.charAt(i + 1) != 'i') {
                    available = false;
                    break;
                }
                i += 1;
                continue;
            }

            if (say.charAt(i) == 'k') {
                if (i + 2 > say.length() || say.charAt(i + 1) != 'a') {
                    available = false;
                    break;
                }
                i += 1;
                continue;
            }

            if (say.charAt(i) == 'c') {
                if (i + 3 > say.length() || say.charAt(i + 1) != 'h' || say.charAt(i + 2) != 'u') {
                    available = false;
                    break;
                }
                i += 2;
                continue;
            }

            available = false;
            break;
        }

        if (available) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
