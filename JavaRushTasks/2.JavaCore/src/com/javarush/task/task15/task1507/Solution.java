package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
//        System.out.println(printMatrix());
//        printMatrix("Hello World!");
    }


    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static String printMatrix(){
        return "Matrix";
    }
    public static void printMatrix(String s){
        System.out.println(s);
    }
    public static void printMatrix(String s, int i){

    }
    public static void printMatrix(int i, String s){

    }
    public static void printMatrix(int i, String s, float y){

    }
    public static void printMatrix(int i, float y, String s){

    }
    public static void printMatrix(int i, float y, Object s){

    }
    public static void printMatrix(Object s, int i, float y){

    }
}
