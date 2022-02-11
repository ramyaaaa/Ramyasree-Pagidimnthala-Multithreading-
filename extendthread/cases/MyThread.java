package com.extendthread.cases;

public class MyThread extends Thread {
	public void start() {
		super.start(); //thread class start method
		System.out.println("start method" + " "+ Thread.currentThread().getState());
	}
	public void run() {
		System.out.println("run method" + " "+Thread.currentThread().getState());
	}
	
}

class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread(); //main thread create child thread
		t.start();
		System.out.println("main method"+" "+ Thread.currentThread().getState());
	}
}


/*
 * if we override start will be executed just like a normal 
 * method call and new thread wont be created
 * o/p - start and main method -- produced by only main thread
 */

//-----------------------
//it is not recommended to override start method 
//child thread responsible for run method
//main thread responsible for start method then main method
//main and child thread executes simultaneously
//possible outputs:
//	1. run method      2. start method		3.start method
//		start method		main method			run method
//		main method			run method			main method