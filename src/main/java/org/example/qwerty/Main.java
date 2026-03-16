package org.example.qwerty;

import java.util.regex.Matcher;

public class Main {

    /*
    Есть строка из произвольных символов, нужно найти в ней максимальный int.
    Пример строки: s = "df122gk123dfgd124dfghjk1sdfg2db99" result = 124
     */
    public static void main(String[] args) {
        String s = "df122gk123dfgd124dfghjk1sdfg2db99";
        String g = "c394507ty3549876t745y3784c59363t4";

        System.out.println(findMaxInt(g));

    }

    public static int findMaxInt(String s) {
        char[] arr = s.toCharArray();
        int max = -1;
        String x = "";

        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]) {
                case '0' : x = x + arr[i]; break;
                case '1' : x = x + arr[i]; break;
                case '2' : x = x + arr[i]; break;
                case '3' : x = x + arr[i]; break;
                case '4' : x = x + arr[i]; break;
                case '5' : x = x + arr[i]; break;
                case '6' : x = x + arr[i]; break;
                case '7' : x = x + arr[i]; break;
                case '8' : x = x + arr[i]; break;
                case '9' : x = x + arr[i]; break;
                default: {
                    if (!x.isEmpty() && max < Integer.parseInt(x)) {
                        max = Integer.parseInt(x);
                    }
                    x = "";
                }
            }
        }
        if (max < Integer.parseInt(x)) {
            max = Integer.parseInt(x);
        }
        return max;
    }
}
