package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;
    private Rectangle anotherRectangle;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }
    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle anotherRectangle){
            this.left = anotherRectangle.left;
            this.top = anotherRectangle.top;
            this.width = anotherRectangle.width;
            this.height = anotherRectangle.height;
          }

    public static void main(String[] args) {

    }
}
