package utils;

import java.util.Random;

public class Utils {

    public static int getRandomInt(int min, int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
    }

    public static String generateRandomString(int len){
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }
}
