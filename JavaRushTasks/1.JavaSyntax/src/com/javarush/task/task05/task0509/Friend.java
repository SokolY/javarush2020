package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char sex){
        this.age =age;
        this.sex = sex;
        this.name = name;
    }

    public static void main(String[] args) {
//        Friend oleg = new Friend();
//        oleg.initialize("Stepan", 25);
//        System.out.println(oleg.name + " " + oleg.age);



    }
}
