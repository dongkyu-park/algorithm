package bj_2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1) {
                if (str.charAt(i) == 'c') {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }

                if (str.charAt(i) == 'd') {
                    if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }

                if (str.charAt(i) == 'l') {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }

                if (str.charAt(i) == 'n') {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }

                if (str.charAt(i) == 's') {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }

                if (str.charAt(i) == 'z') {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            if (i < str.length() - 2) {
                if (str.charAt(i) == 'd') {
                    if (str.charAt(i + 1) == 'z') {
                        if (str.charAt(i + 2) == '=') {
                            i = i + 2;
                        }
                    }
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
