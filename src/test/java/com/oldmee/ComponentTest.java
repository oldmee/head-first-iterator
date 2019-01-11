package com.oldmee;

import com.oldmee.menu.Menu;
import com.oldmee.menu.MenuItem;
import com.oldmee.menu.component.MenuComponent;
import org.junit.Test;



/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 14:59 2019/1/10
 */
public class ComponentTest {
    @Test
    public void componentTest() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast", new PancakeHouseMenu().createIterator());
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch", new DinerMenu().createIterator());
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner", new CafeMenu().createIterator());
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!", new DessertMenu().createIterator());

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined", null);

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // 在这里加入菜单项
        dinerMenu.add(new MenuItem("Pasta", "bread", true, 3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
