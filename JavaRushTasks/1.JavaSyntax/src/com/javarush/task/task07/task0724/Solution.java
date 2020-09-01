package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
//        Human grandMother = new Human ("Stasya", false, 88);
//        Human grandFather = new Human("Yaroslav", true, 72);
//        Human grandMother2 = new Human("Olga", false, 83);
//        Human grandFather2 = new Human("Timofiy", true, 82);
//        Human mother = new Human("Valya", false, 58, grandFather2, grandMother2);
//        Human father = new Human("Igor", true, 59, grandFather, grandMother);
//        Human aunt = new Human("Nadya", false, 67, grandFather2, grandMother2);
//        Human me  =new Human("Yura", true,35, mother, father);
//        Human brother = new Human("Volodya", true, 32, mother, father);
//        System.out.println(grandMother);
//        System.out.println(grandFather);
//        System.out.println(grandMother2);
//        System.out.println(grandFather2);
//        System.out.println(mother);
//        System.out.println(father);
//        System.out.println(aunt);
//        System.out.println(me);
//        System.out.println(brother);
        Human grandMother, grandFather, grandMother2, grandFather2, mother, father;
        ArrayList<Human> family = new ArrayList<Human>();
        family.add(grandMother = new Human("Stasya", false, 88));
        family.add(grandFather = new Human("Yaroslav", true, 72));
        family.add(grandMother2 = new Human("Olga", false, 83));
        family.add(grandFather2 = new Human("Timofiy", true, 82));
        family.add(mother = new Human("Valya", false, 58, grandFather2, grandMother2));
        family.add(father = new Human("Igor", true, 59, grandFather, grandMother));
        family.add(new Human("Nadya", false, 67, grandFather2, grandMother2));
        family.add(new Human("Yura", true,35, mother, father));
        family.add(new Human("Volodya", true, 32, mother, father));
        for(Human hum :  family){
            System.out.println(hum);
        }
    }

    public static class Human {
        // напишите тут ваш код
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;

    public Human(String name, boolean sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human (String name, boolean sex, int age, Human father, Human mother){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}