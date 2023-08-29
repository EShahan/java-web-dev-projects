package org.launchcode;

import java.util.ArrayList;

public class Menu {


    public ArrayList<MenuItems> menuItemsArray;

    public ArrayList<MenuItems> getMenuItemsArray() {
        return menuItemsArray;
    }

    public void setMenuItemsArray(ArrayList<MenuItems> menuItemsArray) {

        // call addMenuItems
        // Set Date
    }

    private void addMenuItems(MenuItems menuItems) {
        menuItemsArray.add(menuItems);

    }

    private void removeMenuItems(MenuItems menuItems) {
        menuItemsArray.remove(menuItems);

    }
}
