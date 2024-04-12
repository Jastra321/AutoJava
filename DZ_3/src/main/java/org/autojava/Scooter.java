package org.autojava;

public final class Scooter extends Transport{
    public Scooter(int numPassenger, int speed, boolean useGaz, boolean useElectric, boolean haveRadio, boolean playRadio, double radioStation) {
        super(numPassenger, speed, useGaz, useElectric, haveRadio, playRadio, radioStation);
        this.numPassenger = 1;
    }

    private final int numPassenger;

    public  final void moving() {
        System.out.println("moving");
    }

    public int getNumPassenger() {
        return numPassenger;
    }
}
