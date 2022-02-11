package com.newstage.lc;


// thread will be in this state after calling the start() method
public class ThreadRunnable {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.start(); //checking the state after starting the method
		System.out.println(t.getState());
	}
}
