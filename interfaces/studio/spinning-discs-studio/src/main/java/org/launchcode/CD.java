package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("Data was stored to the CD");
    }

    @Override
    public void laserWriteDisc() {
        System.out.println("Laser writes data to CD");
    }

    @Override
    public void laserReadDisc() {
        System.out.println("Laser reads CD data");
    }
}
