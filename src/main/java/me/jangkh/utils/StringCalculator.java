package me.jangkh.utils;

public class StringCalculator {
    public static int splitAndSum(String text) {
        int result = 0;

        if (text == null || text.isEmpty()) {
            return result;
        }

        String[] values = text.split(",|:|;");
        for (String val : values) {
            result += Integer.parseInt(val);
        }

        return result;
    }
}
