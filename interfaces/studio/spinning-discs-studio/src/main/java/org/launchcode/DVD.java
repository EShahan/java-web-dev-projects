package org.launchcode;

import java.sql.SQLOutput;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("Data was stored to the DVD");
    }

    @Override
    public void laserWriteDisc() {
        System.out.println("Laser writes data to DVD");
    }

    @Override
    public void laserReadDisc() {
        System.out.println("Laser reads DVD data");
    }
}
