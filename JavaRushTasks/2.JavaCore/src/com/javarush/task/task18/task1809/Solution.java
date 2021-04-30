package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inpfile = new FileInputStream("d://t.txt");
        FileOutputStream outFile1 = new FileOutputStream("d://out.txt");
//
//        ArrayList<Integer> byt = new ArrayList<>();
//        while (inpfile.available()>0){
//           byt.add(inpfile.read());
//
//        }
////        System.out.println(byt.size());
//        for(int i = byt.size()-1; i>=0; i--){
//            outFile1.write(byt.get(i));
//        }
        Stack <Integer> stack = new Stack<>();
        while (inpfile.available()>0){
            stack.push(inpfile.read());
        }
        while (!stack.empty()){
            outFile1.write(stack.pop());
        }
    inpfile.close();
        outFile1.close();
    }

}
