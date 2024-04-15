package org.autojava;

public class Car extends Transport{
    public Car(String model, Double height, Double weight, Short maxSpeed) {
        super(model, height, weight, maxSpeed);
    }

    public String getReview(){
        return super.getInfo();
    }
}
