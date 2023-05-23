package com.bitcoin.oldschool.service;

import com.bitcoin.oldschool.model.Entropy;
import com.bitcoin.oldschool.model.Wallet;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.LegacyAddress;
import org.bitcoinj.params.MainNetParams;

import java.math.BigInteger;

public class NonDeterministicKeyGenerator {

    public static Wallet generateNonDeterministicKey(Entropy entropy) {
        ECKey ecKey = ECKey.fromPrivate(new BigInteger(entropy.getEntropyHex(), 16));
        Wallet wallet = new Wallet();
        wallet.setPrivateKeyHex(ecKey.getPrivateKeyAsHex());
        wallet.setPrivateKeyWif(ecKey.getPrivateKeyAsWiF(new MainNetParams()));
        wallet.setLegacyAddress(LegacyAddress.fromKey(new MainNetParams(), ecKey).toString());
        return wallet;
    }

}
