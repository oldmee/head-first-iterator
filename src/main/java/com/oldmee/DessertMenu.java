package com.oldmee;

import com.oldmee.menu.Menu;
import com.oldmee.menu.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 13:02 2019/1/10
 */
public class DessertMenu extends Menu {
    Hashtable menuItems = new Hashtable();

    public DessertMenu() {
        addItem("DessertMenu01", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("DessertMenu02", "Bacon with lettuce & tomato onwhole wheat", false, 2.99);
        addItem("DessertMenu03", "Soup of the day, with a side of potato salad", false, 3.29);
    }

    private void addItem(String hotdog, String orderId, boolean b, double v) {
        MenuItem menuItem = new MenuItem(hotdog, orderId, b, v);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    public void initIterator(Iterator iterator) {
        iterator = createIterator();
    }

}
