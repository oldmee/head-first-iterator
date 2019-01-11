package com.oldmee.iterator.impl;

import com.oldmee.menu.MenuItem;

import java.util.Iterator;
//import com.oldmee.iterator.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:19 2019/1/9
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        return items[position++];
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position] != null) {
            for ( int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i+1];
            }
            items[items.length - 1] = null;
        }
    }
}
