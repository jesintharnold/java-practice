package CON_1;

public class Adder implements Runnable{
    private int a;
    private int b;
    public Adder(int A,int B){
        this.a=A;
        this.b=B;
    };

    @Override
    public void run(){
        System.out.println(this.a+this.b);
    };
}
