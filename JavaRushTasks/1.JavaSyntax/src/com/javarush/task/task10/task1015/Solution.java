package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args){
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList(){
        //напишите тут ваш код
        ArrayList<String> arList[] = new ArrayList[4];
        String i = "i";
        for (int j = 0; j<4; j++) {
            arList[j] = new ArrayList<>();
                arList[j].add(i);
        }
        return arList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}