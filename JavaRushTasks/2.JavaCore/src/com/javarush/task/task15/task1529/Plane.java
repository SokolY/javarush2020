package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    private int pasangers;
    @Override
    public void fly() {
        System.out.println("Літак полетів");
    }

    public Plane(int pasangers){
        this.pasangers = pasangers;
    }
}
