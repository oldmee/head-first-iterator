package com.oldmee.menu;

import com.oldmee.NullIterator;
import com.oldmee.menu.component.MenuComponent;

import java.util.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:39 2019/1/9
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetarian=" + vegetarian +
                ", price=" + price +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    public Iterator createIterator() {
        return new NullIterator();
    }
}
