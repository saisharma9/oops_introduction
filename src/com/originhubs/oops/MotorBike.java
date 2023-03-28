package com.originhubs.oops;

public class MotorBike

{

    private int speed;
    private String name;


    //Parameterized Constructor
    public MotorBike(int spd, String naam)
    {
        this.speed = spd;
        this.name = naam;
    }

    public MotorBike() {
    }

    // Getter and Setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        System.out.println("Speed passed in argument  " +speed);
        System.out.println("Speed this.speed "+ this.speed);
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //methods
    public void start()
    {
        System.out.println(name +"  Started at speed  " + speed);
    }

    public void stop()
    {
        System.out.println(name +"  Stopped at speed  "+ speed);
    }
}
