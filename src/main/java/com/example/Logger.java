package com.example;

//public final class Logger {
//    private Logger() {}
//
//    private static Logger INSTANCE;
//
//    void log(String logMessage) {
//        System.out.println(logMessage);
//    }
//
//    public static Logger getLogger(){
//        if(INSTANCE==null)
//        {
//            INSTANCE=new Logger();
//        }
//        return INSTANCE;
//    }
//
//}

enum  Logger{
    INSTANCE;
    void log(String logMessage) {
        System.out.println(logMessage);
    }



}
