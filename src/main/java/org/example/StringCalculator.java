package org.example;

public class StringCalculator {

    String regex = "[\n,]";

    public int add(String number) {
        if (delimiterProvided(number)) {
            this.regex = "[\n" + number.charAt(2) + "]";
        }
        String[] split = number.split(regex);
        int res = 0;
        for (int i = 0; i < split.length; i++) {
            if (delimiterProvided(number) && i == 0) {
                continue;
            }
            res += Integer.parseInt(split[i]);
        }
        return res;
    }

    private boolean delimiterProvided(String number) {
        return number.charAt(0) == '/';
    }
}
