package CON_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    private Integer n;
    private ArrayList<Integer> array;
    public ArrayCreator(Integer n){
        this.n=n;
    };

    private ArrayList<Integer> createArray(){
        array=new ArrayList<>();
        for(int i=1;i<=n;i++){
            array.add(i);
        };
        return array;
    };
    @Override
    public ArrayList<Integer> call() throws Exception {
        return createArray();
    }
}
