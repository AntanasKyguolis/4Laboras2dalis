package com.isvestine3;

import com.bazine.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements Sildymas {
    private int kubai;

    public SildymasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, int kubai) {
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.kubai = kubai;
    }

    @Override
    public int getKubai() {
        return kubai;
    }

    @Override
    public void setKubai(int kubai) {
        this.kubai = kubai;
    }

    @Override
    public String toString() {
        return "SildymasImpl{" +
                "kubai=" + kubai +
                '}';
    }
}