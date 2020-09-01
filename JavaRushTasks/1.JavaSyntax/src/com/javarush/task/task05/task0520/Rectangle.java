package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;
    public Rectangle(int left, int top, int weight, int height){
        this.left = left;
        this.top = top;
        this.width = weight;
        this.height = height;
    }
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }
    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height= width;
    }
    public Rectangle(Rectangle anotherRectangle){
        left = anotherRectangle.left;
        top = anotherRectangle.top;
        width = anotherRectangle.width;
        height = anotherRectangle.height;
    }
    public static void main(String[] args) {

    }
}
