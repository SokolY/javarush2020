package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static
    {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
       String st= "(050)3377492";
//        System.out.println("(" + st.substring(0, 3) + ")" +st.substring(3, 6) +"-" + st.substring(6,8) + "-" + st.substring(8,10));
//        System.out.println(st.replaceAll(м));

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String country = null;
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getKey().equals(data.getCountryCode())) {
                    country =  entry.getValue();
                    break;
                }
            }
            return country;
        }

        @Override
        public String getName() {
            return (data.getContactLastName() + ", " + data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            String phoneNumber  = String.valueOf(data.getPhoneNumber());
            while (phoneNumber.length()<10){
                phoneNumber = "0" + phoneNumber;
            }
            return "+" + data.getCountryPhoneCode() + "(" + phoneNumber.substring(0, 3) + ")" +phoneNumber.substring(3, 6) +"-" + phoneNumber.substring(6,8) + "-" + phoneNumber.substring(8,10);

        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}