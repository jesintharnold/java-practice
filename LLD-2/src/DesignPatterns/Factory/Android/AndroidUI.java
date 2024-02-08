package DesignPatterns.Factory.Android;

import DesignPatterns.Factory.components.AndroidMenu;
import DesignPatterns.Factory.components.Menu;

public class AndroidUI implements UIcomponent{
    @Override
    public Menu renderMenu() {
        return new AndroidMenu();
    }
}
