package org.example;

public class StringCalculator {

    String regex = "[\n,]";

    public int add(String number) {
        if (delimiterProvided(number)) {
            this.regex = "[\n" + number.charAt(2) + "]";
        }

        String[] split = number.split(regex);
        StringBuilder sb = new StringBuilder();

        int res = 0;
        for (int i = 0; i < split.length; i++) {
            if (delimiterProvided(number) && i == 0) {
                continue;
            }
            int num = Integer.parseInt(split[i]);
            if (num < 0) {
                sb.append(num).append(",");
            }
            res += num;
        }

        if (!sb.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
            throw new IllegalArgumentException("Negative numbers not allowed: " + sb);
        }

        return res;
    }

    private boolean delimiterProvided(String number) {
        return number.charAt(0) == '/';
    }
}
