package com.threads.main;

import com.threads.runnable.RunnableDemo;

public class TestRunnable {
    public static void main(String args[]) {
          RunnableDemo R1 = new RunnableDemo( "Thread-1");
          Thread T1=new Thread(R1);// pass an instance of runnable to Thread Constructor
          T1.start();
          
          RunnableDemo R2 = new RunnableDemo( "Thread-2");
          Thread T2=new Thread(R2);
          T2.start();
       }   
}