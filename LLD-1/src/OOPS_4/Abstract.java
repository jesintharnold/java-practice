package OOPS_4;

abstract class Abstract {
    public static int value=2000;
    public abstract void getValue();
    public abstract void setValue();

    public int check(int val){
        return val*value;
    }
}
