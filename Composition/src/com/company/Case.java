package com.company;

public class Case {
    private String Model;
    private String Manufacturer;
    private String powerSupply;
    private Dimensions Dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        Model = model;
        Manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        Dimensions = dimensions;
    }
    public void pressPower(){
        System.out.println("power buton pressed");
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return Dimensions;
    }
}
