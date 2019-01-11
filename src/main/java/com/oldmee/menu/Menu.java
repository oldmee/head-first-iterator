package com.oldmee.menu;

import com.oldmee.CompositeIterator;
import com.oldmee.menu.component.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 11:00 2019/1/10
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList();
    String name;
    String description;
    Iterator iterator;

    public Menu() {
    }
    public Menu(String name, String description, Iterator iterator) {
        this.name = name;
        this.description = description;
        if (iterator != null) {
            while (iterator.hasNext()) {
                menuComponents.add((MenuComponent) iterator.next());
            }
        }
    }
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println(getName() + " , " + getDescription());
        System.out.println("--------------------------------");

        iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

    public void initIterator(Iterator iterator) {
        this.iterator = iterator;
    }
}
