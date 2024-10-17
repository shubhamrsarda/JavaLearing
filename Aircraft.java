package com.company;

/**
 *
 */
public abstract class Aircraft {

    public final void takeOff(){
        this.checkSystem();
        this.getClearance();
        this.implementCustomActivity();
    }

    public abstract void checkSystem();
    public abstract void getClearance();
    public abstract void implementCustomActivity();



    public static void main(String[] args) {
        Aircraft heli = new Helicopter();
        heli.takeOff();
        Aircraft jet = new Jet();
        jet.takeOff();

    }

}
