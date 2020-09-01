package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/


import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double x = sqr(x2 - x1);
        double y = sqr(y2 - y1);
        double distance = sqrt(x+y);
//       double distance = sqrt((x2-x1)^2 + (y2-y1)^2);
       return distance;
    }
    public static double sqr(double a){
        return a*a;
    }

    public static void main(String[] args) {
        System.out.println(Util.getDistance(1,1,4,4));
    }
}
