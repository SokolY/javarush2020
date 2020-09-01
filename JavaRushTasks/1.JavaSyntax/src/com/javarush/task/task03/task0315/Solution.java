package com.javarush.task.task03.task0315;

/* 
Каждый охотник желает знать…
*/

import com.sun.org.apache.xpath.internal.operations.Or;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Red color1 = new Red();
        Orange color2 = new Orange();
        Yellow color3;
        color3 = new Yellow();
        Green color4 = new Green();
        Blue color5 = new Blue();
        Indigo color6 = new Indigo();
        Violet color7;
        color7 = new Violet();

    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
