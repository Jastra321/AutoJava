package org.autojava;

public final class Bus extends Transport{


    public Bus(int numPassenger, int speed, boolean useGaz, boolean useElectric, boolean haveRadio, boolean playRadio, double radioStation) {
        super(numPassenger, speed, useGaz, useElectric, haveRadio, playRadio, radioStation);
        this.numPassenger = numPassenger;
        this.speed = speed;
        this.useGaz = useGaz;
        this.useElectric = useElectric;
        this.haveRadio = haveRadio;
    }
    private int numPassenger;
    private int speed;
    private boolean useGaz;
    private boolean useElectric;
    private boolean haveRadio;

    public final void moving() {
        System.out.println("автобус едет");
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

    private void setUseGaz(boolean useGaz) {
        this.useGaz = useGaz;
    }

    public boolean isUseElectric() {
        return useElectric;
    }

    private void setUseElectric(boolean useElectric) {
        this.useElectric = useElectric;
    }

    public boolean isHaveRadio() {
        return haveRadio;
    }

    private void setHaveRadio(boolean haveRadio) {
        this.haveRadio = haveRadio;
    }
}
