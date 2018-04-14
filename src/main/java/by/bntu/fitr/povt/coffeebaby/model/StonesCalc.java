/*package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Arrays;
import java.util.Comparator;


public class StonesCalc implements Calculator {
    public void sortStonesByWeigth(Necklace necklace) {
        Arrays.sort(necklace.getNecklace(), new Comparator<Stone>() {
            public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getWeigth(), o2.getWeigth());
            }
        });
    }


    public void sortStonesByPrice(Necklace necklace) {
        Arrays.sort(necklace.getNecklace(), new Comparator<Stone>() {
            public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
    }

    public double totalCaratWeigth(Necklace necklace) {
        double caratWeigth = 0.0;
        for (Stone stone : necklace.getNecklace()) {
            caratWeigth += stone.getWeigth();
        }
        return caratWeigth;
    }

    public double totalPriceForNecklace(Necklace necklace) {
        double price = 0;
        for (Stone stone : necklace.getNecklace()) {
            price += stone.getPrice() * stone.getWeigth();
        }
        return price;
    }
}
*/