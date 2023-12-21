package org.cashdash.utils;

import java.security.SecureRandom;
import java.util.Random;

public class Rand {
    private static final String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateString(int length) {
        StringBuilder result = new StringBuilder(length);

        Random rand = new SecureRandom();
        for (int i = 0; i < length; i++) {
            result.append(charset.charAt(rand.nextInt(charset.length())));
        }

        return result.toString();
    }
}
