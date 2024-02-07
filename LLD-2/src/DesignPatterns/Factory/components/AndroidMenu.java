package DesignPatterns.Factory.components;

public class AndroidMenu implements Menu {
    @Override
    public void render() {
        System.out.println("Android - Menu");
    }
}
