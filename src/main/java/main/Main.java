/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import main.thread.MyCallable;
import main.thread.MyRunnable;

/**
 *
 * @author SMART
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("run/...");
        for (int i = 0; i < 10; i++) {
ExecutorService service = Executors.newSingleThreadExecutor();
            MyCallable[] arr = new MyCallable[3];
            arr[0] = new MyCallable(1);
            arr[1] = new MyCallable(2);
            arr[2] = new MyCallable(3); 
            
                       
            List<Future<Object>> list = service.invokeAll(Arrays.asList(arr));
            
            Future f = list.get(0);
            
            
            service.shutdown();
            service.awaitTermination(1, TimeUnit.DAYS);
            System.out.println("terminated");
        }

    }

    private static void scheduleThradPool() {
        ScheduledExecutorService ex = Executors.newScheduledThreadPool(1);

        ex.schedule(new MyRunnable(1), 0, TimeUnit.SECONDS);
        ex.schedule(new MyRunnable(1), 0, TimeUnit.SECONDS);
    }

    private static void catchedThreadPool() {
        ExecutorService service1 = new ThreadPoolExecutor(10, 15, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20));
        ExecutorService service2 = Executors.newCachedThreadPool(Executors.defaultThreadFactory());
    }

    private static void fixedThreadPool() {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.submit(new MyRunnable(i));
        }
        service.shutdown();
    }

    private static void singleThreadExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future f = service.submit(new MyRunnable(1));

        service.submit(new MyRunnable(2));
        service.submit(new MyRunnable(3));
        service.submit(new MyRunnable(4));
        service.submit(new MyRunnable(5));

    }

}
