package com.newstage.lc;

//thread will be in this state when thread is sleeping sleep().
public class ThreadTimeWait {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				
			try 
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	};
	t.start();
	try 
	{
		Thread.sleep(2000);
	}
	catch(InterruptedException ie)
	{
		ie.printStackTrace();
	}
	//checking the state when thread is sleeping
	System.out.println(t.getState());
	}
}