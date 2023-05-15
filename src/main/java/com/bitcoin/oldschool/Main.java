package com.bitcoin.oldschool;

import com.bitcoin.oldschool.misc.PrintUtils;
import com.bitcoin.oldschool.model.Entropy;
import com.bitcoin.oldschool.model.Wallet;
import com.bitcoin.oldschool.service.EntropyGenerator;
import com.bitcoin.oldschool.service.NonDeterministicKeyGenerator;
import com.bitcoin.oldschool.service.QRCodeGenerator;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintUtils.generatingEntropyPrompt();
        Entropy entropy = EntropyGenerator.generateEntropy();
        PrintUtils.generatingNonDeterministicKeyPrompt();
        Wallet wallet = NonDeterministicKeyGenerator.generateNonDeterministicKey(entropy);
        PrintUtils.printKeyPairToFile(wallet);
        PrintUtils.generatingQRCodes();
        QRCodeGenerator.generateQRCode(wallet.getPrivateKeyWif(), "./wallet/privateKey.png");
        QRCodeGenerator.generateQRCode(wallet.getLegacyAddress(), "./wallet/legacyAddress.png");
    }

}