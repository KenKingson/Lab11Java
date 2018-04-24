package by.bntu.fitr.povt.coffeebaby.model;

import com.sun.tools.javac.util.List;

import java.util.Collections;

public class BubbleSort {
    public static List<Integer>  bubbleSort(List<Integer> arr) {
        boolean flag ;
        for (int i = arr.size() - 1; i > 0; i--) {
            flag = false;
            for (int j = 0; j < i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Collections.swap(arr,j,j+1);

                    flag = true;
                }
            }
            if (!flag)
            {
                break;
            }
        }
        return  arr;
    }
}