package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int funA = 5 * numA * numA + 3;
        int funB = 5 * numB * numB + 3;
        if (funA == funB) return Integer.compare(numA, numB);
        return Integer.compare(funA, funB);
    }
}
