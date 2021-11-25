package com.company;

import com.bazine.MoketojasImpl;
import com.isvestine.TelefonasImpl;
import com.isvestine2.InternetasImpl;
import com.isvestine3.SildymasImpl;

public class Main {

    public static void main(String[] args) {
        MoketojasImpl moketojas1 = new MoketojasImpl(12345, "Simas", "Simaitis",
                "Kauno g. 35", 23);
        MoketojasImpl moketojas2 = new MoketojasImpl(23456, "Jonas", "Jonaitis",
                "Laisves al. 33-12", 45);
        MoketojasImpl moketojas3 = new MoketojasImpl(34567, "Petras", "Petraitis",
                "Maironio g. 8-2", 40);

        TelefonasImpl telefonas1 = new TelefonasImpl(12345, "Simas", "Simaitis",
                "Kauno g. 35", 29, "+37060012345");
        TelefonasImpl telefonas2 = new TelefonasImpl(23456, "Jonas", "Jonaitis",
                "Laisves al. 33-12", 55, "+37061012345");
        TelefonasImpl telefonas3 = new TelefonasImpl(34567, "Petras", "Petraitis",
                "Maironio g. 8-2", 33, "+37062012345");

        InternetasImpl internetas1 = new InternetasImpl(12345, "Simas", "Simaitis",
                "Kauno g. 35", 15, "171.55.22.333");
        InternetasImpl internetas2 = new InternetasImpl(23456, "Jonas", "Jonaitis",
                "Laisves al. 33-12", 21, "172.22.33.55");
        InternetasImpl internetas3 = new InternetasImpl(34567, "Petras", "Petraitis",
                "Maironio g. 8-2", 18, "173.44.55.22");

        SildymasImpl sildymas1 = new SildymasImpl(12345, "Simas", "Simaitis",
                "Kauno g. 35", 75, 40);
        SildymasImpl sildymas2 = new SildymasImpl(23456, "Jonas", "Jonaitis",
                "Laisves al. 33-12", 80, 55);
        SildymasImpl sildymas3 = new SildymasImpl(34567, "Petras", "Petraitis",
                "Maironio g. 8-2", 120, 65);


        MoketojasImpl[] mokesciuMoketojai = {moketojas1, moketojas2, moketojas3, telefonas1, telefonas2, telefonas3,
                internetas1, internetas2, internetas3, sildymas1, sildymas2, sildymas3};

        double suma1 = 0;

        for (MoketojasImpl mok : mokesciuMoketojai) {
            if (mok instanceof InternetasImpl) {
                InternetasImpl intern = (InternetasImpl) mok;
                suma1 = suma1 + intern.getSuma();
            }

        }
        System.out.println("Suma uz internetą " + suma1 + " Eur");
        double suma2 = 0;

        for (MoketojasImpl mok : mokesciuMoketojai) {
            if (mok instanceof TelefonasImpl) {
                TelefonasImpl telef = (TelefonasImpl) mok;
                suma2 = suma2 + telef.getSuma();
            }

        }
        System.out.println("Suma uz telefoną " + suma2 + " Eur");

        double suma = 0;
        suma = suma1 + suma2;
        System.out.println("Bendra suma uz internetą ir telefoną " + suma + " Eur");

    }
}
