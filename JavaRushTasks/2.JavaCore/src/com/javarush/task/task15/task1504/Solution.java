package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;
//            if (this.author == "Mark Twain"){
//                return markTwainOutput;
//            }
//            else if (this.author == "Agatha Christie"){
//                return agathaChristieOutput;
//            }
            if (this instanceof MarkTwainBook){
                return markTwainOutput;
            }
            else if (getBook() instanceof AgathaChristieBook){
                return agathaChristieOutput;
            }

            String output = "output";
            //Add your code here

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{
        static String author = "Mark Twain";
        private String title;

        public MarkTwainBook(String title) {
            super(MarkTwainBook.author);
            this.title = title;
        }

        //        public MarkTwainBook(String title){
//           this.title = title;
//           super(Book(author));
//        }
        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
    public static class AgathaChristieBook extends Book{
        static String author = "Agatha Christie";
        private String title;

        public AgathaChristieBook(String title) {
            super(AgathaChristieBook.author);
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
}
