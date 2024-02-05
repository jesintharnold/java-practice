package DesignPatterns.Singleton;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionPoolImpl implements ConnectionPool {

    private static ConnectionPool con;
    private final int conSize;
    private static ReentrantLock conLock=new ReentrantLock();
    private Queue<DatabaseConnection> conPool;


    private ConnectionPoolImpl(int conSize){
        this.conSize = conSize;
        this.initializePool();
    };

    public static ConnectionPool getInstance(int maxCons) {
        if(con==null){
            conLock.lock();
            if(con==null){
                con=new ConnectionPoolImpl(maxCons);
            };
            conLock.unlock();
        };
        return con;
    }

    public static void resetInstance() {
        con=null;
    }

    @Override
    public void initializePool() {
        if(conPool==null){
            conPool=new LinkedList<DatabaseConnection>();
            for(int i=0;i<this.conSize;i++){
              conPool.add(new DatabaseConnection());
            };
        };
    }

    @Override
    public DatabaseConnection getConnection() {
        return conPool.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        conPool.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return conPool.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.conSize;
    }
}