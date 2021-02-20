package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String url, url2;
        String catched = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        url = reader.readLine();
        url = "www.ru.org?size=14&hight=2&width=5&obj=lil";
//        url = "www.ru.org?size=14&hight=2&width=5";
//        url = "Добро-пожаловать-на-ProgLang.su";
        String param = url.substring(url.lastIndexOf("?")+1);
        System.out.println(param);
        ArrayList<String> parametr = new ArrayList<>();
        for (String st : param.split("&")) {
            for (String x : st.split("=")) {
                parametr.add(x);
                break;
            }
        }

//        ArrayList<String> paremeters = new ArrayList<>();
//        ArrayList<String> parametr = new ArrayList<>();
//        for (String s : url.split("\\?", 2)) {
//            paremeters.add(s);
//        }
//        for (String st : paremeters.get(paremeters.size() - 1).split("&")) {
//            for (String x : st.split("=")) {
//                parametr.add(x);
//                break;
//            }
//        }
//        for (String st : paremeters.get(paremeters.size() - 1).split("&")) {
//            String obj = "obj";
//            int index;
//            if (st.contains(obj)) {
//                index = st.indexOf("=");
//                catched = st.substring(index + 1);
////                System.out.println("Catched: " + catched);
//                break;
//            }
//
//        }
        for (String s : parametr) {
            System.out.print(s + " ");
        }
//        if (!(catched == null)) {
//            try {
////                System.out.println("Try part");
//                double l =  Double.parseDouble(catched);
//                System.out.println();
//                alert(l);
//            } catch (NumberFormatException e) {
////                System.out.println("Catch part");
//                System.out.println();
//                alert(catched);
//            }
//        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
