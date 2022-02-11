package com.extendthread.cases;

public class MyThreadRun extends Thread{
	public void run() {
		System.out.println("no - arg run");
	}
	public void run(int i) {
		System.out.println("int arg-run");// we have to call explicitly
	}
}

class testOne {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}

//overloading run method
//o/p - no arg run
//thread class start method always calls no argument run method only