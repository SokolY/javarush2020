package com.javarush.task.task17.task1713;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    public void trimToSize() {
        original.trimToSize();
    }

    public void ensureCapacity(int i) {
        original.ensureCapacity(i);
    }

    @Override
    public int size() {
        return original.size();
    }

    @Override
    public boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public Object clone() {
        return original.clone();
    }

    @Override
    public Object[] toArray() {
        return original.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return original.toArray(ts);
    }

    @Override
    public Long get(int i) {
        return original.get(i);
    }

    @Override
    public Long set(int i, Long aLong) {
        return original.set(i, aLong);
    }

    @Override
    public boolean add(Long aLong) {
        return original.add(aLong);
    }

    @Override
    public void add(int i, Long aLong) {
        original.add(i, aLong);
    }

    @Override
    public Long remove(int i) {
        return original.remove(i);
    }

    @Override
    public boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        original.clear();
    }

    @Override
    public boolean addAll(Collection<? extends Long> collection) {
        return original.addAll(collection);
    }

    @Override
    public boolean addAll(int i, Collection<? extends Long> collection) {
        return original.addAll(i, collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return original.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return original.retainAll(collection);
    }

    @Override
    public ListIterator<Long> listIterator(int i) {
        return original.listIterator(i);
    }

    @Override
    public ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    public List<Long> subList(int i, int i1) {
        return original.subList(i, i1);
    }

    @Override
    public void forEach(Consumer<? super Long> consumer) {
        original.forEach(consumer);
    }

    @Override
    public Spliterator<Long> spliterator() {
        return original.spliterator();
    }

    @Override
    public boolean removeIf(Predicate<? super Long> predicate) {
        return original.removeIf(predicate);
    }

    @Override
    public void replaceAll(UnaryOperator<Long> unaryOperator) {
        original.replaceAll(unaryOperator);
    }

    @Override
    public void sort(Comparator<? super Long> comparator) {
        original.sort(comparator);
    }


//    @Override
//    public synchronized int size() {
//        return original.size();
//    }
//
//    @Override
//    public synchronized boolean isEmpty() {
//        return original.isEmpty();
//    }
//
//    @Override
//    public synchronized boolean contains(Object o) {
//        return original.contains(o);
//    }
//
//    @Override
//    public synchronized Iterator<Long> iterator() {
////        return null;
//        return original.iterator();
//    }
//
//    @Override
//    public synchronized Object[] toArray() {
////        return new Object[0];
//        return original.toArray();
//    }
//
//    @Override
//    public synchronized <T> T[] toArray(T[] ts) {
////        return null;
//        return original.toArray(ts);
//    }
//
//    @Override
//    public synchronized boolean add(Long aLong) {
////        return false;
//        return original.add(aLong);
//    }
//
//    @Override
//    public synchronized boolean remove(Object o) {
////        return false;
//        return original.remove(o);
//    }
//
//    @Override
//    public synchronized boolean containsAll(Collection<?> collection) {
////        return false;
//        return original.containsAll(collection);
//    }
//
//    @Override
//    public synchronized boolean addAll(Collection<? extends Long> collection) {
////        return false;
//        return original.addAll(collection);
//    }
//
//    @Override
//    public synchronized boolean addAll(int i, Collection<? extends Long> collection) {
////        return false;
//        return original.addAll(i,collection);
//    }
//
//    @Override
//    public synchronized boolean removeAll(Collection<?> collection) {
////        return false;
//        return original.removeAll(collection);
//    }
//
//    @Override
//    public synchronized boolean retainAll(Collection<?> collection) {
////        return false;
//        return original.retainAll(collection);
//    }
//
//    @Override
//    public synchronized void clear() {
//        original.clear();
//    }
//
//    @Override
//    public synchronized Long get(int i) {
////        return null;
//        return original.get(i);
//    }
//
//    @Override
//    public synchronized Long set(int i, Long aLong) {
////        return null;
//        return original.set(i, aLong);
//    }
//
//    @Override
//    public synchronized void add(int i, Long aLong) {
//        original.add(i, aLong);
//    }
//
//    @Override
//    public synchronized Long remove(int i) {
////        return null;
//    return original.remove(i);
//    }
//
//    @Override
//    public synchronized int indexOf(Object o) {
////        return 0;
//    return original.indexOf(o);
//    }
//
//    @Override
//    public synchronized int lastIndexOf(Object o) {
////        return 0;
//    return original.lastIndexOf(o);
//    }
//
//    @Override
//    public synchronized ListIterator<Long> listIterator() {
////        return null;
//    return original.listIterator();
//    }
//
//    @Override
//    public synchronized ListIterator<Long> listIterator(int i) {
////        return null;
//        return original.listIterator(i);
//    }
//
//    @Override
//    public synchronized List<Long> subList(int i, int i1) {
////        return null;
//        return original.subList(i, i1);
//    }
}