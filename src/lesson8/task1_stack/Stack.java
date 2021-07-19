package lesson8.task1_stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    List<T> list = new ArrayList<>();

    public void put(T object) {
        list.add(object);
    }

    public T get(int index) {
        return list.get(index);
    }
}
