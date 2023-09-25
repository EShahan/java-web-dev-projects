package org.launchcode;

public abstract class BaseDisc {
    protected String name;
    protected double capacity;
    protected String contents;
    protected String discType;

    // Constructor
    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }
}
