package org.autojava;

public class Bus extends Transport{
    public Bus(String model, Double height, Double weight, Short maxSpeed) {
        super(model, height, weight, maxSpeed);
    }

    public String getReview(){
        return super.getInfo();
    }
}
