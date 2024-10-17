package com.company;

public class Helicopter extends Aircraft{

    @Override
    public void checkSystem() {
        System.out.println("In heli checkSystem ");
    }


    @Override
    public void getClearance() {
        System.out.println("In heli getClearance");
    }

    @Override
    public void implementCustomActivity() {
        System.out.println("In heli implementCustomActivity");
    }
}
