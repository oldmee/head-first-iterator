package com.oldmee;

//import com.oldmee.iterator.Iterator;
import com.oldmee.menu.Menu;
import com.oldmee.menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:41 2019/1/9
 */
public class PancakeHouseMenu extends Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /*public ArrayList getMenuItems() {
        return menuItems;
    }*/

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
