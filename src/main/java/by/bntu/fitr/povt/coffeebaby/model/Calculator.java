package by.bntu.fitr.povt.coffeebaby.model;

public interface Calculator {
    void sortStonesByWeigth(Necklace necklace);

    void sortStonesByPrice(Necklace necklace);

    double totalCaratWeigth(Necklace necklace);

    double totalPriceForNecklace(Necklace necklace);
}
