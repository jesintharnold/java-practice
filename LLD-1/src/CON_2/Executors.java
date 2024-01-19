package CON_2;

public class Executors implements Runnable{
    private int number;
    public Executors(int n){
        this.number=n;
    };
    @Override
    public void run() {
        System.out.println("Thread Name - "+Thread.currentThread().getName()+" Count - "+this.number);
    }
}
