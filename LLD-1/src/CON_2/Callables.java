package CON_2;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.ArrayList;
public class Callables implements Callable<List<Integer>> {

    private List<Integer> arr;

    public Callables(List<Integer> A){
        this.arr=A;
    };

    public List<Integer> splitAndJoin(List<Integer> B){
      return  null;
    };

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {
        if(arr.size()<=1) return arr;
        int size = arr.size();
        int mid = size/2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arr.get(i));
        }
        for(int i=mid;i<size;i++){
            rightArray.add(arr.get(i));
        }

        Callables leftArr=new Callables(leftArray);
        Callables rightArr=new Callables(rightArray);

        ExecutorService es= Executors.newCachedThreadPool();
        Future<List<Integer>> leftS=es.submit(leftArr);
        Future<List<Integer>> rightS=es.submit(rightArr);

        List<Integer> x=leftS.get();
        List<Integer> y=rightS.get();

        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < x.size() && j < y.size()) {
            if (x.get(i) <= y.get(j)) {
                sortedArray.add(x.get(i));
                i += 1;
            } else {
                sortedArray.add(y.get(j));
                j += 1;
            }
        }

        while (i < x.size()) {
            sortedArray.add(x.get(i));
            i += 1;
        }

        while (j < y.size()) {
            sortedArray.add(y.get(j));
            j += 1;
        }

        return sortedArray;
    };
}
