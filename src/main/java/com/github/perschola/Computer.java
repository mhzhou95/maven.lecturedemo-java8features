package com.github.perschola;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/19/2019.
 */
public class Computer {
    public List<Object> heavyComputation() {
        return compute(9999999);
    }

    public List<Object> lightComputation() {
        return compute(10);
    }

    private List<Object> compute(Integer numberOfIterations) {
        List<Object> objectList = new ArrayList<>();
        for (int i = 0; i < numberOfIterations; i++) {
            Object object = new Object();
            objectList.add(object);
        }
        return objectList;
    }

}
