package CON_1;

public class TableCreator implements Runnable {

    private int value;
    private int iter;
    public TableCreator(int A,int i){
        this.value=A;
        this.iter=i;
    };

    @Override
    public void run() {
        System.out.println(this.value+" times "+this.iter+" is "+this.value*this.iter);
    }
}
