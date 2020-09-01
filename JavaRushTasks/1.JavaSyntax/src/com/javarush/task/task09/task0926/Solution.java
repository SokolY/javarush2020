package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> intList = new ArrayList<int[]>();
        int[] array1 = new int[] {1, 1, 1, 1, 1};
        int[] arrey2 = new int[] {2, 2};
        int[] arrey3 = new int[] {3, 3, 3, 3};
        int[] arrey4 = new int[] {7, 7, 7, 7, 7, 7, 7};
        int[] arrey5 = new int[0];
        intList.add(array1);
        intList.add(arrey2);
        intList.add(arrey3);
        intList.add(arrey4);
        intList.add(arrey5);
//        intList.add();
        return intList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
