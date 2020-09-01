package com.javarush.task.task08.task0820;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();


        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println(cats.size());
        System.out.println(dogs.size());

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
//напишите тут ваш код
        for (int i = 0; i<4; i++){
            Cat kity = new Cat();
            result.add(kity);
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogSet = new HashSet<>();
        for (int j = 0; j <3 ; j++){
            Dog puppy = new Dog();
            dogSet.add(puppy);
        }
        return dogSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> combinedSet = new HashSet<>();
        Iterator<Cat> ct = cats.iterator();
        while (ct.hasNext()){
            combinedSet.add(ct.next());
        }
        Iterator<Dog> dog = dogs.iterator();
        while (dog.hasNext()){
            combinedSet.add(dog.next());
        }
//        for (Cat cat : cats){
//            combinedSet.add(cat);
//        }
//        for (Dog dog : dogs){
//            combinedSet.add(dog);
//        }
        return combinedSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
//        Iterator<Cat> item = cats.iterator();
        Set<Object> copy = new HashSet<>(pets);
        for (Object pet : copy){
            for (Cat kitty : cats){
            if (pet.equals(kitty)) {
                pets.remove(kitty);
            }
            }
        }
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> item = pets.iterator();
        while (item.hasNext()){
            System.out.println(item.next());
        }

    }
    public static class Cat{
    };
    public static class Dog{
    };
    //напишите тут ваш код
}
