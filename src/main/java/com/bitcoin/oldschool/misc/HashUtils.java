package com.bitcoin.oldschool.misc;

import com.bitcoin.oldschool.converter.BasicConverter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils {

    private static final String SHA256 = "SHA-256";

    public static String sha256(String str) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(SHA256);
        byte[] hashedBytes = md.digest(BasicConverter.hexStringToByteArray(str));
        return BasicConverter.byteArrayToHexString(hashedBytes);
    }

}
