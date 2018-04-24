package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByWeight implements Comparator<Stone>{
    public int compare(Stone stone1, Stone stone2){
        return stone1.getWeigth().compareTo(stone2.getWeigth());
    }
    }

