package com.newstage.lc;


// Thread will be in this state before calling start() method
public class ThreadLifeNew {
	public static void main(String[] args) {
		Thread t = new Thread(); 
		System.out.println(t.getState()); //checking the state of thread before starting (start()) the thread.
	}
}
