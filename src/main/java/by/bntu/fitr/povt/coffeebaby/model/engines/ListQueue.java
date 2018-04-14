package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public class ListQueue extends CommonList {

    public Object pop() {

        Object element = node.element;
        node = node.next;
        return element;

    }


}
