package com.oldmee;

import java.util.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:58 2019/1/10
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
