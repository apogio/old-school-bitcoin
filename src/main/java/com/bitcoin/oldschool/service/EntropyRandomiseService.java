package com.bitcoin.oldschool.service;

import java.security.SecureRandom;


public class EntropyRandomiseService {

    private static final int SECURE_RANDOM_LENGTH = 64;
    private static final int HEX = 16;

    public static String getRandomHexString() throws InterruptedException {
        return secureRandomSource();
    }

    private static String secureRandomSource() throws InterruptedException {
        StringBuilder hexStrBuilder = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        for(int i = 0; i< SECURE_RANDOM_LENGTH; i++){
            int nextInt = secureRandom.nextInt(1024*1024*1024) % HEX;
            hexStrBuilder.append(Integer.toHexString(nextInt));
        }
        return hexStrBuilder.toString();
    }

}
