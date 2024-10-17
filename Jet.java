package com.company;

public class Jet extends Aircraft{
    @Override
    public void checkSystem() {
        System.out.println("In Jet checkSystem ");
    }

    @Override
    public void getClearance() {
        System.out.println("In Jet getClearance ");
    }

    @Override
    public void implementCustomActivity() {
        System.out.println("In Jet implementCustomActivity ");
    }
}
