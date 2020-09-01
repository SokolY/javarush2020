package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Шварц", dateFormat.parse("June 2 2012"));
        map.put("Сталлоне2", dateFormat.parse("MAY 3 2012"));
        map.put("Шварц2", dateFormat.parse("July 4 2012"));
        map.put("Сталлоне3", dateFormat.parse("MAY 5 2012"));
        map.put("Шварц3", dateFormat.parse("June 6 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 7 2012"));
        map.put("Шварц4", dateFormat.parse("July 8 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 9 2012"));
        map.put("Шварц5", dateFormat.parse("July 10 2012"));

            return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Date holidayStartTime = new Date();
        holidayStartTime.setMonth(5);
        Date holidayEndTime = new Date();
        holidayEndTime.setMonth(8);

        Map<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {
            if (pair.getValue().getMonth()>=holidayStartTime.getMonth() && pair.getValue().getMonth()<holidayEndTime.getMonth()) {
                map.remove(pair.getKey());
            }
        }
//        public static Map<String, Date> removeAllSummerPeople(Map<String, Date> map) {
//            Date holidayStartTime = new Date();
//            holidayStartTime.setMonth(5);
//            Date holidayEndTime = new Date();
//            holidayEndTime.setMonth(8);
//
//            Map<String, Date> copy = new HashMap<>(map);
//            for (Map.Entry<String, Date> pair : copy.entrySet()) {
//                if (pair.getValue().getMonth()>=holidayStartTime.getMonth() && pair.getValue().getMonth()<holidayEndTime.getMonth()) {
//                    map.remove(pair.getKey());
//                }
//            }
//            return map;

//            for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
//                Map.Entry<String, Date> entry = it.next();
////                if (entry.getValue().getMonth() > holidayStartTime.getMonth()) {
////                    it.remove();
////                }
//                if (entry.getKey().equals("Шварц")) {
//                    it.remove();
//                }
//            }
        }


    public static void main(String[] args) throws ParseException {
//        for(Map.Entry<String, Date> ent : removeAllSummerPeople(createMap()).entrySet()){
//            System.out.println(ent.getValue().getMonth());
//        }

        }
    }

