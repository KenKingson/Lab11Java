package by.bntu.fitr.povt.coffeebaby.model.engines;

public interface List {
    boolean isEmpty();

    void push(Object element);

    Object pop();

    int size();

    Object getElement(int index);

}
