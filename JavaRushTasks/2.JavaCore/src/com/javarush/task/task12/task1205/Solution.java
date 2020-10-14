package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public enum Action {
        Cow, Whale, Dog, Pig
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        Action ac = Action.valueOf(o.getClass().getSimpleName());
        switch (ac) {
            case Cow:
                return "Корова";
//                break;
            case Whale:
                return "Кит";
            case Dog:
                return "Собака";
            default:
                return "Неизвестное животное";
        }

    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
