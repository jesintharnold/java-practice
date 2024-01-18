package CON_1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner O=new Scanner(System.in);
        int a=O.nextInt();

        for(int i=1;i<=10;i++){
            TableCreator A=new TableCreator(a,i);
            ScalerThread sta=new ScalerThread(A);
            sta.start();
        };
    }
}
