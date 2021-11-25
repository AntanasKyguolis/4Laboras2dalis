package com.bazine;

public class MoketojasImpl implements Moketojas {
    private int moketojoKodas;
    private String vardas;
    private String pavarde;
    private String adresas;
    private double suma;

    public MoketojasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma) {
        this.moketojoKodas = moketojoKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }

    @Override
    public int getMoketojoKodas() {
        return moketojoKodas;
    }

    @Override
    public void setMoketojoKodas(int moketojoKodas) {
        this.moketojoKodas = moketojoKodas;
    }

    @Override
    public String getVardas() {
        return vardas;
    }

    @Override
    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String getPavarde() {
        return pavarde;
    }

    @Override
    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public String getAdresas() {
        return adresas;
    }

    @Override
    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    @Override
    public double getSuma() {
        return suma;
    }

    @Override
    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "MoketojasImpl{" +
                "moketojoKodas=" + moketojoKodas +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", adresas='" + adresas + '\'' +
                ", suma=" + suma +
                '}';
    }
}







