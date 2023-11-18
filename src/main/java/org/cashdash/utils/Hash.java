package org.cashdash.utils;

import org.mindrot.jbcrypt.BCrypt;

public class Hash {
    public static String password(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public static boolean verify(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
