package com.oldmee;

import java.util.Iterator;
import com.oldmee.iterator.impl.DinerMenuIterator;
import com.oldmee.menu.Menu;
import com.oldmee.menu.MenuItem;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:52 2019/1/9
 */
public class DinerMenu extends Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato onwhole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    /*public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
