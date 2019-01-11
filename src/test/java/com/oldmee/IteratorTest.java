package com.oldmee;


import com.oldmee.iterator.impl.DinerMenuIterator;
import org.junit.Test;

import java.util.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 18:29 2019/1/9
 */
public class IteratorTest {

    @Test
    public void test() {
        PancakeHouseMenu dinerMenu = new PancakeHouseMenu();
        Iterator iterator = dinerMenu.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
