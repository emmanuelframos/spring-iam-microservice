package com.utils;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptUtils {

    public static String hash(String property, Integer logRounds){
        return BCrypt.hashpw(property, BCrypt.gensalt(logRounds));
    }

    public static boolean matches(String candidate, String hashed){
        return BCrypt.checkpw(candidate, hashed);
    }
}