package CON_2;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.concurrent.Future;

public class Clientt {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
//        Executors
//        ExecutorService et= java.util.concurrent.Executors.newFixedThreadPool(10);
//        for(int i=0;i<10;i++){
//          Executors A=new Executors(i);
//          et.execute(A);
//        };

        ExecutorService es= Executors.newCachedThreadPool();
        List<Integer> A= Arrays.asList(3,2,5,1,6,9,4,5);
        Callables ca=new Callables(A);
        Future<List<Integer>> ft=es.submit(ca);
        List<Integer> d=ft.get();
        System.out.println(d);
    }
}
