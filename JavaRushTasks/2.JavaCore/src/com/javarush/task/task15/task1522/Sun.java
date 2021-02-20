package com.javarush.task.task15.task1522;

public class Sun implements Planet{
    private Sun(){};
    private static Sun instance;
    public static synchronized Sun getInstance(){
        if(instance == null){
//            System.out.println("Sun was created");
           instance = new Sun();
        }
        return instance;
    }
}
