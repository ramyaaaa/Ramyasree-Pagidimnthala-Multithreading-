package sample;

public class App extends Thread {
	public void run() {
		System.out.println("inside run");

	}
}

class ThreadDemo {
	public static void main(String[] args) throws InterruptedException
	{	
		
	    System.out.println("Main thread starts");
	    App t = new App();            // MyThread extends Thread
	    t.start();
	    System.out.println("2"+" "+t.getState());        // true
	    t.join();                               // main method waits for thread t to complete
	    System.out.println("3"+" "+t.getState());        // false
	    Thread.sleep(3000);                     // main method sleeps for 3 seconds
	    System.out.println("Main thread ends");
	    
	}

}