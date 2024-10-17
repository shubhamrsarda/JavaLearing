package com.company;

public class JetEngine {

    String model;
    int fanSpeed;
    int maxSpeed;
    String level;

    {
        level = "FIRST ";
        System.out.println("In Initiliser non static block");
    }

    public JetEngine(){
        System.out.println("Default...");
    }

    public JetEngine(String model) {
        this();
        this.model = model;
        System.out.println("model...");
    }

    public JetEngine(String model,int fanSpeed){
        this(model);
        this.fanSpeed= fanSpeed;
        System.out.println("model and fanSpeed..");
    }

    public  JetEngine(String model,int fanSpeed,int maxSpeed){
        this(model,fanSpeed);
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args) {
        JetEngine jet = new JetEngine("trent",10,20);
        JetEngine jet2 = new JetEngine("trent2",100,202);
        System.out.println(jet.level);
        System.out.println(jet2.level);
    }

}

