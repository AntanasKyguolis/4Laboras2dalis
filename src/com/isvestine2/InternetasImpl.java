package com.isvestine2;

import com.bazine.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements Internetas {
    private String ipAdresas;

    public InternetasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, String ipAdresas) {
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.ipAdresas = ipAdresas;
    }

    @Override
    public String getIpAdresas() {
        return ipAdresas;
    }

    @Override
    public void setIpAdresas(String ipAdresas) {
        this.ipAdresas = ipAdresas;
    }

    @Override
    public String toString() {
        return "InternetasImpl{" +
                "ipAdresas='" + ipAdresas + '\'' +
                '}';
    }
}