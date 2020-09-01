package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String nationality;
        private String name;
        private boolean sex;
        private int age;
        private String proffesion;
        private boolean isMarrige;
        public Human(String nationality){
            this.nationality = nationality;
        }
        public Human(boolean sex){
            this.sex = sex;
        }
        public Human (String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String proffesion, int age, boolean sex){
            this.proffesion = proffesion;
            this.age = age;
            this.sex = sex;
        }
        public Human(boolean sex, String name, String nationality){
            this.sex = sex;
            this.name = name;
            this.nationality = nationality;
        }
        public Human(String name, String nationality, String proffesion){
            this.name = name;
            this.nationality = nationality;
            this.proffesion = proffesion;
        }
        public Human(String name, String nationality, String proffesion, int age){
            this.name = name;
            this.nationality = nationality;
            this.proffesion = proffesion;
            this.age = age;
        }
        public Human(String name, String nationality, String proffesion, boolean sex){
            this.name = name;
            this.nationality = nationality;
            this.proffesion = proffesion;
            this.sex = sex;
        }
        public Human(String name, String nationality, String proffesion, boolean sex, boolean isMarrige){
            this.name = name;
            this.nationality = nationality;
            this.proffesion = proffesion;
            this.sex = sex;
            this.isMarrige = isMarrige;
        }
        public Human (String name, String nationality, String proffesion, boolean sex, boolean isMarrige, int age){

            this.name = name;
            this.nationality = nationality;
            this.proffesion = proffesion;
            this.sex = sex;
            this.isMarrige = isMarrige;
            this.age = age;
        }

        // Напишите тут ваши переменные и конструкторы
    }
}
