package DesignPatterns.Factory;

import DesignPatterns.Factory.components.IOSMenu;
import DesignPatterns.Factory.components.Menu;

public class IOSUI implements UIcomponent{
    @Override
    public Menu renderMenu() {
        return new IOSMenu();
    }
}
