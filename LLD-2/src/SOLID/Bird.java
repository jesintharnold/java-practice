package SOLID;

public abstract class Bird{
    private String setName;

    public Bird(String setName) {
        this.setName = setName;
    };

    public abstract void eat();

}
