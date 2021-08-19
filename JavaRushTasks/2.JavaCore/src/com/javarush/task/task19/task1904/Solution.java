package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner){
            fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[]arr = line.split(" ", 4);
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date date = null ;
            try {
                date = format.parse(arr[3]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(arr[1], arr[2], arr[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
