package org.launchcode;

public class Main {

    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Evanescence", 700, "Bring Me To Life", "CD");
        DVD myDVD = new DVD("Star Wars", 4.7, "A New Hope", "DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
//        myCD.spinDisc();
//        myCD.storeData();
//        myCD.laserWriteDisc();
//        myCD.laserReadDisc();
//        myDVD.spinDisc();
//        myDVD.storeData();
//        myDVD.laserWriteDisc();
//        myDVD.laserReadDisc();

        System.out.println(myCD.name);
        System.out.println(myCD.capacity);
        System.out.println(myCD.contents);
        System.out.println(myCD.discType);
        System.out.println(myDVD.name);
        System.out.println(myDVD.capacity);
        System.out.println(myDVD.contents);
        System.out.println(myDVD.discType);

    }
}
