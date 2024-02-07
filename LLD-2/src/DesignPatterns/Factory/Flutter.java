package DesignPatterns.Factory;

public class Flutter{
    public void render(){
        System.out.println("-RENDER-");
    };

    public UIcomponent Menu(String platform){
        if(platform.equalsIgnoreCase("android")){
            System.out.println("AND");
            return new AndroidUI();
        }else if(platform.equalsIgnoreCase("ios")){
            System.out.println("IOS");
            return new IOSUI();
        }
        return null;
    };
}
