package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Comparator;


public class ComparatorWeight implements Comparator<Stone>{

    public int compare(Stone stone1, Stone stone2){
       Double weight1 = stone1.getWeigth();
       Double weight2 = stone2.getWeigth();
        return weight1.compareTo(weight2);
    }
    }

