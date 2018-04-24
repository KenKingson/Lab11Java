package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Collections;


public class StonesCalc implements Calculator {


    public void sortStonesByWeigth(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new ComparatorWeight());
    }


    public void sortStonesByPrice(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new ComparatorPrice());

    }

}
