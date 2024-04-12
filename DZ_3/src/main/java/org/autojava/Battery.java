package org.autojava;

public class Battery {
    public Battery(String brand, Integer bVoltage){
        this.brand = brand;
        this.bVoltage = bVoltage;
    };

    private String brand;
    private Integer bVoltage;

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getbVoltage() {
        return bVoltage;
    }

    private void setbVoltage(Integer bVoltage) {
        this.bVoltage = bVoltage;
    }
}
