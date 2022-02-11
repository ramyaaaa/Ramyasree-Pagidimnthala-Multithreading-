package com.newstage.lc;


//Thread will be in this state once it finishes it's execution
public class ThreadTerminated {
	public static void main(String[] args) {
		Thread t = new Thread()
				{
					public void run()
					{
						for(int i=0;i<=25;i++) {
							System.out.println(i);
						}
					}
				};
				t.start();
				try 
				{
					Thread.sleep(2000); //main thread is sleeping for 2 sec
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
				
				System.out.println(t.getState()); //checking the state when thread t is finished it's execution
	}
}
