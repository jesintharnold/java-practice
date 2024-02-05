package DesignPatterns.Singleton;

//import org.springframework.boot.logging.LogLevel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LoggerImpl implements Logger {
    private static Logger logInst;
    private PrintWriter fw;
    private String filePath;
//    @Override
//    public void log(LogLevel level, String message) {
//        if(this.fw == null) throw new IllegalStateException();
//
//        this.fw.append(level.toString());
//        this.fw.append(message);
//    }
    public static Logger getInstance(){
        if(logInst==null) {
            logInst=new LoggerImpl();
        };
        return logInst;
    };

    public static void resetInstance(){
        logInst = null;
    }

    @Override
    public void setLogFile(String filePath) {
        try {
            this.filePath = filePath;
            this.fw = new PrintWriter(filePath);
        } catch(FileNotFoundException ex) {

        }
    }

    @Override
    public String getLogFile() {
        return this.filePath;
    }

    @Override
    public void flush() {
        this.fw.flush();
    }

    @Override
    public void close() {
        this.fw.close();
        this.fw = null;
    }
}