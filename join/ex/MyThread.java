package com.join.ex;

public class MyThread extends Thread { //MyThread is the child class of the class Thread
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("first thread"+ " "+ Thread.currentThread().getState());
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}

class ThreadJoinDemo 
{
	public static void main(String[] args) throws InterruptedException {
		MyThread t =  new MyThread();
		t.start();
		t.join(); //t.join(10000); //if we comment join then both main and child threads will be executed simultaneously and we cannot except exact output
		
		for(int i=0;i<10;i++) {//if we  not commenting join then main thread calls join method on child thread object hence main thread will wait until completing child thread
		}
			System.out.println("second thread"+ " "+ Thread.currentThread().getState());
		}
	}
}
