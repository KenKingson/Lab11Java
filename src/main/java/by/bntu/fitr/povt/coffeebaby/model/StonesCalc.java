package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class StonesCalc implements Calculator {


    public void sortStonesByWeigth(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new Comparator<Stone>() {
            public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getWeigth(), o2.getWeigth());
            }
        });
    }


    public void sortStonesByPrice(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new Comparator<Stone>() {
            public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }


}
