package org.autojava;

import java.util.Enumeration;

public class Engine {
    public Engine(String brand, String eType, Integer eVolume){
        this.brand = brand;
        this.eType = eType;
        this.eVolume = eVolume;
    };

    private String brand;
    private String eType;
    private Integer eVolume;

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    public String geteType() {
        return eType;
    }

    private void seteType(String eType) {
        this.eType = eType;
    }

    public Integer geteVolume() {
        return eVolume;
    }

    private void seteVolume(Integer eVolume) {
        this.eVolume = eVolume;
    }
}
