package com.originhubs.oops;

public class MotorBikeRunner
{
    public static void main(String[] args)
    { MotorBike ducati = new MotorBike();
        MotorBike yamaha = new MotorBike(141, "Rx100");



        ducati.start();
        yamaha.stop();

         ducati.setSpeed(167);
        System.out.println(ducati.getSpeed());


    }


}
