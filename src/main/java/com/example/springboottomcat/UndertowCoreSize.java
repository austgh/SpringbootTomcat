package com.example.springboottomcat;

/**
 * @author think
 * @date 2023年09月20日 14:02
 */
public class UndertowCoreSize {
    public static void main(String[] args) {
        //Undertow 最大线程说
        int ioThreads = Math.max(Runtime.getRuntime().availableProcessors(), 2);
        int workerThreads = ioThreads * 8;
        System.out.println("workerThreads :"+workerThreads);
    }
}
