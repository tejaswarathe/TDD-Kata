package org.example;

public class StringCalculator {

    public int add(String number) {
        String[] split = number.split("[,\n]");
        int res = 0;
        for (String s : split) {
            res += Integer.parseInt(s);
        }
        return res;
    }
}
