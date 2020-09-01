package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

import java.util.concurrent.Callable;

public class Cat {
    public int age;
    public int weight;
    public int strength;

//    public Cat() {
//    }
//        public boolean fight(Cat anotherCat) {
//        int total = 0;
//        if (this.age > anotherCat.age) {
//            total++;
//        } else {
//            total--;
//        }
//        if (this.weight > anotherCat.weight) {
//            total++;
//        } else {
//            total--;
//        }
//        if (this.strength > anotherCat.strength) {
//            total++;
//        } else {
//            total--;
//        }
//        return total>=0?true:false;
//    }
        public boolean fight(Cat anotherCat) {
        int total = 0;
//        int point2 = 0;
        if (this.age > anotherCat.age) {
            total++;
        } else if (this.age<anotherCat.age){
            total--;
        }
        if (this.weight > anotherCat.weight) {
            total++;
        } else if(this.weight < anotherCat.weight){
            total--;
        }
        if (this.strength > anotherCat.strength) {
            total++;
        } else if(this.strength<anotherCat.strength){
            total--;
        }
        return total>0?true:false;
    }
//    public boolean fight(Cat anotherCat) {
//        int pointTo1 = 0;
//        int pointTo2 = 0;
//        if (this.age > anotherCat.age) {
//            pointTo1 = pointTo1 + 1;
//        } else if (this.age<anotherCat.age){
//            pointTo2 = pointTo2 + 1;
//        }
//        if (this.weight > anotherCat.weight) {
//            pointTo1 = pointTo1 + 1;
//        } else if(this.weight<anotherCat.weight){
//            pointTo2 = pointTo2 + 1;
//        }
//        if (this.strength > anotherCat.strength) {
//            pointTo1 = pointTo1 + 1;
//        } else if(this.strength<anotherCat.strength){
//            pointTo2 = pointTo2 + 1;
//        }
//        if (pointTo1 == pointTo2)
//            return false;
//        else if (pointTo1>pointTo2){
//            return true;
//        }
//        else return false;
//
//    }


    public static void main(String[] args) {
    Cat cat1 = new Cat();
   cat1.age = 5;
   cat1.weight = 4;
   cat1.strength =10;
    Cat cat2 = new Cat();
    cat2.age = 5;
    cat2.weight = 4;
    cat2.strength = 6;
        System.out.println(cat1.weight);
        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
    }
}
