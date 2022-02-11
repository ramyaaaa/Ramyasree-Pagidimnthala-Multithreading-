package com.newstage.lc;


//Thread will be in this state when join() method is called
public class ThreadWaiting {
	public static void main(String[] args) {
		Thread t1 = new Thread()
				{
					public void run() 
					{
						try 
						{
							Thread.sleep(2000);
						}
						catch(InterruptedException ie)
						{
							ie.printStackTrace();
						}
					}
				};
				
				Thread t2 = new Thread()
				{
					public void run() 
					{
						try
						{
							t1.join(); // in this stage t2 is waiting to completion of t1
						}
						catch(InterruptedException ie)
						{
							ie.printStackTrace();
						}
					}
			
				};
				t2.start();
				t1.start();
				try 
				{
					Thread.sleep(100);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
				System.out.println(t2.getState());
	}
	
}
