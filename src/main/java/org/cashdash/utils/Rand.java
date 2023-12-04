package org.cashdash.utils;

import java.security.SecureRandom;
import java.util.Random;

public class Rand {
    private static final String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateString(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);

        Random rand = new SecureRandom();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(charset.charAt(rand.nextInt(charset.length())));
        }

        return stringBuilder.toString();
    }
}
