package org.autojava;

public class Transport {

    public String model;
    private Double height;
    protected Double weight;
    Short maxSpeed;

    public Transport(){}

    public Transport(String model, Double height, Double weight, Short maxSpeed) {
        this.model = model;
        this.height = height;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public Transport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Double getHeight() {
        return height;
    }
    private void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public Short getMaxSpeed() {
        return maxSpeed;
    }

    public String getInfo(){
        return (this.getModel() + this.getHeight() + this.getWeight() + this.getMaxSpeed());
    }
}
