package com.implrun.cases;

public class MyRunnable implements Runnable {
	public void run() 
	{
		for(int i=0;i<10;i++) //executed by child thread
			System.out.println("child thread"+ " "+ Thread.currentThread().getState());
	}
}

class Test {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r); //target runnable 
		t.start();
		for(int i=0;i<10;i++) //executed by main thread
			System.out.println("main thread"+ " "+ Thread.currentThread().getState());
	}
}
 