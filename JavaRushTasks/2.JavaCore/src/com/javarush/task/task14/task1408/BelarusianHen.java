package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    private int eggsCount = 25;
    public int getCountOfEggsPerMonth(){
        return eggsCount;
    }
    @Override
    String getDescription(){
        return (super.getDescription()) + " Моя страна - " + Country.BELARUS + ". Я несу " + eggsCount + " яиц в месяц.";
    }
}
