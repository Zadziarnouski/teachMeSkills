package com.zadziarnouski.lesson9.task28;

import java.util.ArrayList;
import java.util.List;

public class Stock<T> {

    List<T> list = new ArrayList<>();

    public void put(T object) {
        list.add(object);
    }

    public T get(int index) {
        return list.get(index);
    }
}
