package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        Human yura = new Human("Yurii", true, 35);
        Human volodya = new Human("Volodya", true, 32, new ArrayList<>());
        Human ivanka = new Human("Ivanka", false, 30, new ArrayList<>());
//        Human valya = new Human("Valya", false, 59, new ArrayList<>(Arrays.asList(yura, volodya, ivanka)));

        children.add(yura);
        children.add(volodya);
        children.add(ivanka);
        Human valya = new Human("Valya", false, 59, children);
        Human igor = new Human("Igor", true, 59, new ArrayList<>(Arrays.asList(ivanka, volodya, yura)));

        Human olga = new Human("Olga", false, 84, new ArrayList<>(Arrays.asList(valya)));
        Human timofiy = new Human("Timofiy", true, 82, new ArrayList<>(Arrays.asList(valya)));
        Human stanislava = new Human("Stanislava", false, 85, new ArrayList<>(Arrays.asList(igor)));
        Human yaroslav = new Human("Yaroslav", true, 81,  new ArrayList<>(Arrays.asList(igor)));

        //        //напишите тут ваш код
//        System.out.println(yura.toString());
//        System.out.println(volodya.toString());
//        System.out.println(ivanka.toString());
//        System.out.println(valya.toString());
//        System.out.println(igor.toString());
//        System.out.println(olga.toString());
//        System.out.println(timofiy.toString());
//        System.out.println(stanislava.toString());
//        System.out.println(yaroslav.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();



        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(this.toString());
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
