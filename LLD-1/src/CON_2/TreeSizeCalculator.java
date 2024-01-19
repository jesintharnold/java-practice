package CON_2;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Calculating the TreeSizeCalculator
public class TreeSizeCalculator implements Callable<Integer> {

    public Node node;
    public ExecutorService es;
    public TreeSizeCalculator(Node node,ExecutorService es){
        this.node=node;
        this.es=es;
    };

    @Override
    public Integer call() throws Exception {
        if(node==null) return 0;
        TreeSizeCalculator left=new TreeSizeCalculator(node.left,es);
        TreeSizeCalculator right=new TreeSizeCalculator(node.right,es);
        Future<Integer> leftCount=es.submit(left);
        Future<Integer> rightCount=es.submit(right);

        Integer lc=leftCount.get();
        Integer rc=rightCount.get();

        return lc+rc+1;
    }
}

