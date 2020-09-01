package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;
    int averAge = 6;
    int averWeight = 7;
    String anyColor = "any";
    public Cat(String name){
        this.name = name;
        this.age = averAge;
        this.weight = averWeight;
        this.color = anyColor;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = anyColor;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        weight = averWeight;
        color = anyColor;
    }
    public Cat(int weight, String color){
        age = averAge;
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        age = averAge;
        this.color = color;
        this.weight = weight;
        this.address = address;
    }
    public static void main(String[] args) {
//    Cat murzik = new Cat(8, "grey", "Ternopil");
//        System.out.println(murzik.age);
    }
}
