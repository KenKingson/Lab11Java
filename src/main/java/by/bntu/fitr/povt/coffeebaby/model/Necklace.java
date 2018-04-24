package by.bntu.fitr.povt.coffeebaby.model;


import by.bntu.fitr.povt.coffeebaby.model.engines.List;


public class Necklace<T extends List> {
    private T container;

    public Necklace(T containers) {
        this.container = containers;
    }


    public T getNecklace() {
        return container;
    }


    public void addStone(Stone stone) {
        container.push(stone);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < container.size(); i++) {

            builder.append(container.getElement(i).toString());

        }
        return "Necklace{" + builder + " }";


    }
}