package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zergA;
        zergA = new Zerg();
        zergA.name = "zergA";
        Zerg zergB = new Zerg();
        zergB.name = "zergB";
        Zerg zergC = new Zerg();
        zergC.name = "zergC";
        Zerg zergD;
        zergD = new Zerg();
        zergD.name = "zergD";
        Zerg zergE = new Zerg();
        zergE.name = "zergE";

        Protoss protossI = new Protoss();
        protossI.name = "protossI";
        Protoss protossII;
        protossII = new Protoss();
        protossII.name = "protossII";
        Protoss protossIII = new Protoss();
        protossIII.name = "protossIII";

        Terran terran1 = new Terran();
        terran1.name = "terran1";
        Terran terran2;
        terran2 = new Terran();
        terran2.name = "terran2";
        Terran terran3 = new Terran();
        terran3.name = "terran3";
        Terran terran4 = new Terran();
        terran4.name = "terran4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
