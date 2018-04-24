package by.bntu.fitr.povt.coffeebaby.model;


import by.bntu.fitr.povt.coffeebaby.model.engines.List;

import java.util.AbstractList;
import java.util.Collection;



public class Necklace<T extends AbstractList> {
    private T container;

    public Necklace(T containers) {
        this.container = containers;
    }


    public T getNecklace() {
        return container;
    }


    public void addStone(Stone stone) {
        container.add(stone);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < container.size(); i++) {

            builder.append(container.get(i).toString());

        }
        return "Necklace{" + builder + " }";


    }
}