package synchronizationblock;
//to get lock of current object

class Display {
	public void wish(String name) {
		synchronized(this) { //synchronized block //to get class level lock then we define synchronized(Display.class)
			for(int i=0;i<10;i++) {
				System.out.println("Good Morning");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {}
				System.out.println(name);
			}
		
		}
	}
}
class MyThread extends Thread {
	Display d;
	String name;
	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SynchronizedBlockDemo {
	public static void main(String[] args) {
		Display d = new Display();  //single object "d"
		MyThread t1 = new MyThread(d, "Infosys 1");  //t1 got lock of current obj and calls wish method by passing argument as infosys 1
		MyThread t2 = new MyThread(d, "Infosys 2");	//t2 calls wish method by passing argument as infosys 2
		t1.start();
		t2.start();
	}
}
