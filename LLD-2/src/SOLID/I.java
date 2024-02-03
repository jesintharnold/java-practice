package SOLID;

interface flies{
    public int fliesCount();
}

public class I extends Bird implements flies {

    public I(String setName) {
        super(setName);
    };

    @Override
    public void eat() {
        System.out.println("I am eating");
    };

    @Override
    public int fliesCount() {
        return 1000;
    }


}
