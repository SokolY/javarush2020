package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 8; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
//        ArrayList<String> copy = new ArrayList<>(list);
        Set<String> sets = new HashSet<>(list);
        //напишите тут ваш код
        String in;
        int counter;
//        for (Iterator<String> it = sets.iterator(); it.hasNext(); ) {
//            counter = 0;
//            String f = it.next();
//            for (int j = 0; j<list.size(); j++){
//                if (f.equals(list.get(j))){
//                    counter++;
//                }
//            }
//            result.put(f, counter);
//        }





        for (int i=0; i<list.size(); i++){
            in = list.get(i);
            counter = 0;
            for (int j = 0; j <list.size(); j++){
                String in2 = list.get(j);
//                if(i==j){
//                    continue;
//                }
                if (in.equals(in2)){
                    counter++;
//                    list.remove(j);
//                    j--;
                }
            }
            result.put(in, counter);
//            if (counter>1){
//                for ()
//            }
        }
        return result;
    }

}

