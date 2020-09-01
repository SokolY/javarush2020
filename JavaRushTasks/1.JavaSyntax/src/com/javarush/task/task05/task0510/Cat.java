package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int age;
    int weight;
    String address = null;
    String color;
    int averageAge = 5;
    int aveargeWeight =7;
    String averColor = "grey";

    public void initialize(String name){
        this.name = name;
        this.age = averageAge;
        this.weight = aveargeWeight;
        this.color = averColor;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = averColor;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        weight = aveargeWeight;
        color = averColor;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = averageAge;
    }
    public void initialize(int weight, String color, String address){
        this.weight =weight;
        this.color = color;
        this.address = address;
        age = averageAge;
    }


    public static void main(String[] args) {
//    Cat vaska = new Cat();
//    vaska.initialize("Vaska");
//        System.out.println(vaska.name);
    }
}
