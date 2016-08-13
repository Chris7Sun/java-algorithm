package com.nowcoder.exercise;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Chris on 2016/8/13.
 */
class MyThread extends Thread {
    private int tid;
    public MyThread (int tid) {
        this.tid = tid;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++){
                Thread.sleep(1000);
                System.out.println(tid + ":" + i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class MultiThreadTest {
    private static Object object = new Object();
    public static void main(String[] args) {
//        testThread();
//        testSynchronized();
//        testBlockingQueue();
        testThreadLocal();
    }
    public static void testSynchronized1(){
        synchronized (object) {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println("Td3" + ":" + i);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void testSynchronized2(){
        synchronized (new Object()) {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println("Td4" + ":" + i);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void testSynchronized(){
        for (int i = 0; i < 10; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    testSynchronized1();
                    testSynchronized2();
                }
            }).start();
        }
    }
    public static void testThread(){
        for(int i = 0; i < 10; i++){
            //new MyThread(i).start();
        }
        for (int i=0; i < 10; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i < 10; i++){
                            Thread.sleep(1000);
                            System.out.println("Td" + ":" + i);
                        }

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
    public static void testBlockingQueue(){
        BlockingQueue<String> q = new ArrayBlockingQueue<String>(10);
        Producer producer = new Producer(q);
        Consumer c1 = new Consumer(q);
        Consumer c2 = new Consumer(q);
        new Thread(producer).start();
        new Thread(c1, "Consumer1: ").start();
        new Thread(c2, "Consumer2: ").start();
    }
    private static ThreadLocal<Integer> threadLocalUsers = new ThreadLocal<>();
    private static int userId;
    public static void testThreadLocal(){
        for (int i = 0; i < 10; i++){
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        threadLocalUsers.set(finalI);
                        Thread.sleep(1000);
                        System.out.println("ThreadLocal:" + threadLocalUsers.get());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        for (int i = 0; i < 10; i++){
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        userId = finalI;
                        Thread.sleep(1000);
                        System.out.println("userId:" + userId);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
class Producer implements Runnable {
    private BlockingQueue<String> q;
    public Producer(BlockingQueue<String> q){
        this.q = q;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++){
                Thread.sleep(1000);
                q.put(String.valueOf(i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Consumer implements Runnable{
    private BlockingQueue<String> q;
    public Consumer(BlockingQueue<String> q){
        this.q = q;
    }
    @Override
    public void run() {
        while (true){
            try {
                System.out.println(Thread.currentThread().getName() + q.take());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}