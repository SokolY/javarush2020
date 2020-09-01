package com.javarush.task.task06.task0614;

/* 
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            Cat kitty = new Cat();
            cats.add(kitty);
        }

        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        //напишите ту
        for (Cat i : cats){
            System.out.println(i.toString());
        }
    }
}
