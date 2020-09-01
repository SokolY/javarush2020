package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(){
        this(2, 4, 4);
//        this.x = 2;
//        this.y = 4;
//        this.radius = 5;
    }
    public Circle(double x){
        this.x = x;
    }
    public Circle(double x, double y){
        this(x);
        this.y = y;
    }
    public Circle(double x, double y, double radius){
        this(x, y);
        this.radius = radius;
    }

    public static void main(String[] args) {
    Circle round = new Circle(3.0, 4, 2);
    Circle round1 = new Circle();
        System.out.println(round1.radius);
    }
}