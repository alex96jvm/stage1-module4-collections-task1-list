package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3){
            String el = sourceList.get(i);
            arrayList.add(el);
            arrayList.add(el);
        }
        return arrayList;
    }
}
