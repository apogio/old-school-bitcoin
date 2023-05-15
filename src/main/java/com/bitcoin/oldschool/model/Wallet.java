package com.bitcoin.oldschool.model;

public class Wallet {

    private String privateKeyHex;
    private String privateKeyWif;
    private String legacyAddress;

    public String getPrivateKeyHex() {
        return privateKeyHex;
    }

    public void setPrivateKeyHex(String privateKeyHex) {
        this.privateKeyHex = privateKeyHex;
    }

    public String getPrivateKeyWif() {
        return privateKeyWif;
    }

    public void setPrivateKeyWif(String privateKeyWif) {
        this.privateKeyWif = privateKeyWif;
    }

    public String getLegacyAddress() {
        return legacyAddress;
    }

    public void setLegacyAddress(String legacyAddress) {
        this.legacyAddress = legacyAddress;
    }

}
