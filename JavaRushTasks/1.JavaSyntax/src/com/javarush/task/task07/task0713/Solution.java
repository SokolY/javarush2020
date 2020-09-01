package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> dividedBy3 = new ArrayList<>();
        ArrayList<Integer> dividedBy2 = new ArrayList<>();
        ArrayList<Integer> othetLst = new ArrayList<>();

        for(int i = 0; i<5; i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(reader.readLine());
            mainList.add(num);
        }
        for (Integer j: mainList) {
            if(j%2 == 0){
                if(j%3 == 0){
                    dividedBy3.add(j);
                }
                dividedBy2.add(j);
            }
            else if (j%3 == 0){
                dividedBy3.add(j);
            }
            else {
                othetLst.add(j);
            }
        }
        printList(dividedBy3);
        printList(dividedBy2);
        printList(othetLst);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int j = 0; j<list.size(); j++)
         {
            System.out.println(j);
        }
    }
}
