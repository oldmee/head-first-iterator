package com.oldmee.iterator.impl;

import com.oldmee.iterator.Iterator;

import java.util.ArrayList;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:24 2019/1/9
 */
public class PancakehouseIterator implements Iterator {
    ArrayList items;
    int position = 0;
    public PancakehouseIterator(ArrayList items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        return items.get(position++);
    }
}
