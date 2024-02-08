package DesignPatterns.Factory.Android;

import DesignPatterns.Factory.components.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flu=new Flutter();
        UIcomponent comp=flu.Menu("ios");
        Menu menu=comp.renderMenu();
        menu.render();
    }
}
