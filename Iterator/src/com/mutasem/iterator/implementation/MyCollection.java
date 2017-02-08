/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mutasem.iterator.implementation;

/**
 *
 * @author Mutasem
 */
public class MyCollection implements Iterable {
    private String[] items;
    private int size, max;
    public MyCollection(int max) {
        items = new String[max];
    }
    public void add(String item) {
        if (size < max) {
            items[size] = item;
            size++;
        }
    }
    public int getSize() {
        return size;
    }
    private class MyIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < size) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if (this.hasNext()) {
                return items[index++];
            }
            return null;
        }
    }
    @Override
    public Iterator getIterator() {
        return new MyIterator();
    }
}
