package com.javarush.task.task07.task0712;

        import java.io.IOException;

/*
Самые-самые
*/
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        for(int s = 0; s <10; s++){
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            strings.add(in.readLine());
        }
        int minLength = strings.get(0).length();
        int minLengthIndex = 0;
        int maxLength = strings.get(0).length();
        int maxLengthIndex = 0;
        for(int i = 0; i<strings.size(); i++){
            if(strings.get(i).length()<minLength){
                minLength = strings.get(i).length();
                minLengthIndex = i;
            }
            if(strings.get(i).length()>maxLength){
                maxLength = strings.get(i).length();
                maxLengthIndex = i;
            }
        }
        if(minLengthIndex<maxLengthIndex){
            System.out.println(strings.get(minLengthIndex));
        }
        else {
            System.out.println(strings.get(maxLengthIndex));
        }

    }
}