package com.bitcoin.oldschool.misc;

import com.bitcoin.oldschool.model.Wallet;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintUtils {

    private static final int DELAY_MS = 500;

    public static void printKeyPairToFile(Wallet wallet) throws IOException {
        FileWriter fileWriter = new FileWriter("./wallet/keys.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("----------");
        printWriter.println("| Wallet |");
        printWriter.println("----------");
        printWriter.println("Private Key: " + wallet.getPrivateKeyHex());
        printWriter.println("Private Key (WIF): " + wallet.getPrivateKeyWif());
        printWriter.println("Legacy Address: " + wallet.getLegacyAddress());
        printWriter.close();
    }

    public static void generatingEntropyPrompt() throws InterruptedException {
        System.out.println("----------------------");
        System.out.println("| Generating Entropy |");
        System.out.println("----------------------");
    }

    public static void generatingNonDeterministicKeyPrompt() throws InterruptedException {
        System.out.println("-------------------");
        System.out.println("| Generating Keys |");
        System.out.println("-------------------");
    }

    public static void generatingQRCodes() throws InterruptedException {
        System.out.println("-----------------------");
        System.out.println("| Generating QR Codes |");
        System.out.println("-----------------------");
    }

}
