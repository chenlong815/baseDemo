package com.jbase.stu004_thread;

/**
 * Created by chenlong on 2016/9/7.
 */
public class TestStart {
    public static void main(String[] args){
        MyThread myThread=new MyThread();
        myThread.start();

        MyThread2 myThread2=new MyThread2();
        Thread thread=new Thread(myThread2);
        thread.start();


    }
}
