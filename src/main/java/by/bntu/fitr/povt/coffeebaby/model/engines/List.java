package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public interface List {
    boolean isEmpty();

    void push(Object element);

   Object pop();

    int size();

    Object getElement(int index);

}
