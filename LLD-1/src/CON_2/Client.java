package CON_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner s=new Scanner(System.in);
        Integer number=s.nextInt();
        ExecutorService es= Executors.newCachedThreadPool();
        ArrayCreator B=new ArrayCreator(number);
        Future<ArrayList<Integer>> A=es.submit(B);
        System.out.println(A.get());
    }
}
