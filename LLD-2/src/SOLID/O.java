package SOLID;
//Open/Closed Principle
//This states that whatever you are writing it should be extensible and have Modularity

interface fly{
    public void isFlying();
    public  boolean isFly();
}

public class O implements  fly{

    @Override
    public void isFlying() {

    }

    @Override
    public boolean isFly() {
        return false;
    }
}

