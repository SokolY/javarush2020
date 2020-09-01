package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> muchesList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<10; i++){
            integerArrayList.add(Integer.parseInt(reader.readLine()));
        }
        int muchesNubber = 1;
        for(int j = 0; j<integerArrayList.size()-1; j++){
            int foo = integerArrayList.get(j);
            int bar = integerArrayList.get(j+1);
//            if(integerArrayList.get(j) != integerArrayList.get(j+1)){
//            if(foo != bar){
            if(!integerArrayList.get(j).equals(integerArrayList.get(j+1))){
                if(muchesNubber>1){
                    muchesList.add(muchesNubber);
                }
                muchesNubber = 1;
                continue;
            }
            else if(j == integerArrayList.size()-2){
                muchesNubber++;
                muchesList.add(muchesNubber);
//                System.out.println("Last");
            }
            else {
                muchesNubber++;
            }


        }
//        Collections.sort(muchesList);
//        if(muchesList.size()>0){
//        System.out.println(muchesList.get(muchesList.size()-1));}
//        else{
//            System.out.println(1);
//        }
        for (Integer i : muchesList){
            System.out.println(i);
        }

    }
}