package DesignPatterns.Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static String DbInstance=null;
    static ReentrantLock exe=new ReentrantLock();


    //This is for Single ThreadEnvironment
//    public static String getDbInstance() {
//        if(DbInstance==null){
//            DbInstance="Hi,I am DB!";
//        };
//        return DbInstance;
//    }

    //This is for Multi-Threaded environments
    public static String getDbInstance(){
        if(DbInstance==null){
            //T1      T2
            exe.lock();
            if(DbInstance==null){ //T1 checks for null and create a DBInstance here .while T2 waits when T2 hits,
                // DbInstance will be already there so T2 will fail at 2nd null and skip to return DbInstance
                DbInstance="Hi,I am DB";
            };
            exe.unlock();
        };
        return DbInstance;
    };

    public static void main(String[] args) {
        Singleton S=new Singleton();
        System.out.println(S.getDbInstance());
    }
}
