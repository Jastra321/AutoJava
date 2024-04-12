package org.autojava;

public class Radiator {
    public Radiator(String brand){
        this.brand = brand;
    };

    private String brand;

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }
}
