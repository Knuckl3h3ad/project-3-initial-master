package com.example.iterable;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public class Bag<T> implements Container<T>, Iterator<T> {

    private final List<T> bag = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    @Override
    public int size() {
        return bag.size();
    }

    @Override
    public void add(T item) {
        bag.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return bag.iterator();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return iterator().next();
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action);
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }

}
