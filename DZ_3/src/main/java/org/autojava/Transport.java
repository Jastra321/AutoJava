package org.autojava;

 abstract class Transport {
     Transport(int numPassenger, int speed, boolean useGaz, boolean useElectric, boolean haveRadio, boolean playRadio, double radioStation){
         this.numPassenger = numPassenger;
         this.speed = speed;
         this.useGaz = useGaz;
         this.useElectric = useElectric;
         this.haveRadio = haveRadio;
         this.playRadio = playRadio;
         this.radioStation = radioStation;
     }

     private int numPassenger;
     private int speed;
     private boolean useGaz;
     private boolean useElectric;
     private boolean haveRadio;
     private boolean playRadio;
     private double  radioStation;



     abstract void moving();

     public String stoping() {
         System.out.println("применить тормоз");
         return "применить тормоз";
     }

     public int getNumPassenger() {
         return numPassenger;
     }
}
