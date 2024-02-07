package DesignPatterns.Factory.components;

public class IOSMenu implements Menu{
    @Override
    public void render() {
        System.out.println("IOS - Menu");
    }
}
