package org.autojava;

public final  class Car extends Transport{
    public Car( String model, Engine engine, Radiator radiator, Battery battery, int numPassenger, int speed, boolean useGaz, boolean useElectric, boolean haveRadio, boolean playRadio, double radioStation) {
        super(numPassenger, speed, useGaz, useElectric, haveRadio, playRadio, radioStation);
        this.numPassenger = numPassenger;
        this.speed = speed;
        this.useGaz = true;
        this.useElectric = true;
        this.haveRadio = true;
    }

    private String model;
    private Engine engine;
    private Radiator radiator;
    private Battery battery;
    private int numPassenger;
    private int speed;
    private final boolean useGaz;
    private final boolean useElectric;
    private final boolean haveRadio;

    public void moving() {
    System.out.println("машина едет");
    }

    @Override
    public final String stoping() {
        System.out.println("нажать педаль тормоза правой ногой");
        return "нажать педаль тормоза правой ногой";
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    private void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Radiator getRadiator() {
        return radiator;
    }

    private void setRadiator(Radiator radiator) {
        this.radiator = radiator;
    }

    public Battery getBattery() {
        return battery;
    }

    private void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    private void setNumPassenger(int numPassenger) {
        this.numPassenger = numPassenger;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isUseGaz() {
        return useGaz;
    }

    public boolean isUseElectric() {
        return useElectric;
    }

    public boolean isHaveRadio() {
        return haveRadio;
    }
}
