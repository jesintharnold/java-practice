package JAD_1;

import java.util.*;
public class Pair <A,B>{
    private A first;
    private B second;


    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public <T,G,H> G addition(T num1,T num2,H hen,G ret){
        System.out.println(num1+" "+num2+" "+hen);
        return  ret;
    };

    public static void main(String[] args) {

    }
}
