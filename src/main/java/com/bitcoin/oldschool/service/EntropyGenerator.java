package com.bitcoin.oldschool.service;

import com.bitcoin.oldschool.model.Entropy;

import java.security.NoSuchAlgorithmException;

public class EntropyGenerator {

    public static Entropy generateEntropy() throws NoSuchAlgorithmException, InterruptedException {
        Entropy entropy = new Entropy();
        entropy.setEntropyHex(EntropyRandomiseService.getRandomHexString());
        return entropy;
    }

}
