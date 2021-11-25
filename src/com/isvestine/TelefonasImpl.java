package com.isvestine;

import com.bazine.MoketojasImpl;

public class TelefonasImpl extends MoketojasImpl implements Telefonas {
    private String telNumeris;

    public TelefonasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, String telNumeris) {
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.telNumeris = telNumeris;
    }

    @Override
    public String getTelNumeris() {
        return telNumeris;
    }

    @Override
    public void setTelNumeris(String telNumeris) {
        this.telNumeris = telNumeris;
    }

    @Override
    public String toString() {
        return "TelefonasImpl{" +
                "telNumeris='" + telNumeris + '\'' +
                '}';
    }
}